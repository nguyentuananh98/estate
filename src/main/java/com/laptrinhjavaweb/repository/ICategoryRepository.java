package com.laptrinhjavaweb.repository;

import java.util.List;

import com.laptrinhjavaweb.dto.CategoryDTO;
import com.laptrinhjavaweb.entity.CategoryEntity;

public interface ICategoryRepository extends JpaRepository<CategoryEntity>{
	//List<CategoryDTO> findAll();
}
