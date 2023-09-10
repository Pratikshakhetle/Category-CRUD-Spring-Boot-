package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Repository.CategoryRepository;
import com.crud.model.Category;

@RestController
@RequestMapping("/api")
public class CategoryController {
@Autowired
	CategoryRepository categoryRepository;
@PostMapping("/categories")
public String createCategory(@RequestBody Category category) {
	 categoryRepository.save(category);
	 return "Category Created in Database";
}

}
