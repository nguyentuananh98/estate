package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.dto.CategoryDTO;

public class CategoryMapper implements RowMapper<CategoryDTO>{

	@Override
	public CategoryDTO mappRow(ResultSet rs) {
		try {
		CategoryDTO categories = new CategoryDTO();
		categories.setName(rs.getString("name"));
		categories.setCode(rs.getString("code"));
		return categories;
		}catch(SQLException e) {
			return null;
		}
	}

}
