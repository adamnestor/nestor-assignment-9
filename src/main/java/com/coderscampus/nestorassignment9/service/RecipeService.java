package com.coderscampus.nestorassignment9.service;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coderscampus.nestorassignment9.domain.Recipe;

import jakarta.annotation.PostConstruct;

@Service
public class RecipeService {

	@Autowired
	private FileService fileService;
	private List<Recipe> recipes;
	
	
	@PostConstruct
	public void collectRecipesInList() throws IOException {
		recipes = fileService.processCSV();
	}
	
	public List<Recipe> filterRecipes(Predicate<Recipe> filterCriteria){
		return recipes.stream().filter(filterCriteria).collect(Collectors.toList());
	}
	
	public List<Recipe> allRecipes(){
		return recipes;
	}
	
	public List<Recipe> veganRecipes(){
		return filterRecipes(recipe -> recipe.getVegan());
	}
	
	public List<Recipe> vegetarianRecipes(){
		return filterRecipes(recipe -> recipe.getVegetarian());
	}
	
	public List<Recipe> glutenFreeRecipes(){
		return filterRecipes(recipe -> recipe.getGlutenFree());
	}
	
	public List<Recipe> veganAndGlutenFree(Predicate<Recipe> filterCriteria1, Predicate<Recipe> filterCriteria2){
		Predicate<Recipe> combinedCriteria = filterCriteria1.and(filterCriteria2);
		return recipes.stream().filter(combinedCriteria).collect(Collectors.toList());
	}
}
