package com.laptrinhjavaweb.service.impl;

import java.util.List;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.repository.ICategoryRepository;
import com.laptrinhjavaweb.repository.impl.CategoryRepository;
import com.laptrinhjavaweb.service.ICategoryService;

public class CategoryService implements ICategoryService{
	private ICategoryRepository categoryRepository = new CategoryRepository();
	@Override
	public List<CategoryDTO> findAll() {
		//return categoryRepository.findAll();
		return null;
	}

}
