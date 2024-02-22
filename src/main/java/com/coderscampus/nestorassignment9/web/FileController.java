package com.coderscampus.nestorassignment9.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.nestorassignment9.domain.Recipe;
import com.coderscampus.nestorassignment9.service.RecipeService;

@RestController
public class FileController {
	
	@Autowired
	RecipeService recipeService;

	@GetMapping("/all-recipes")
	public List<Recipe> displayAllRecipes(){
		return recipeService.allRecipes();
	}
	
	@GetMapping("/vegan")
	public List<Recipe> displayVeganRecipes(){
		return recipeService.veganRecipes();
	}
	
	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> displayVeganAndGlutenFreeRecipes(){
		return recipeService.veganAndGlutenFreeRecipes();
	}
	
	@GetMapping("/vegetarian")
	public List<Recipe> displayVegetarianRecipes(){
		return recipeService.vegetarianRecipes();
	}
	
	@GetMapping("/gluten-free")
	public List<Recipe> displayGlutenFreeRecipes(){
		return recipeService.glutenFreeRecipes();
	}
}
