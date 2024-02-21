package com.coderscampus.nestorassignment9.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.nestorassignment9.domain.Recipe;

@RestController
public class FileController {
	
	@Autowired
	private Recipe recipe;

	@GetMapping("")
	public List<Recipe> getAllRecipes(List<Recipe> recipeList){
		return recipeList;
	}
}
