package com.laptrinhjavaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.laptrinhjavaweb.dto.NewDTO;

public class NewMapper implements RowMapper<NewDTO>{

	@Override
	public NewDTO mappRow(ResultSet rs) {
		try {
		NewDTO news  = new NewDTO();
		news.setTitle(rs.getString("title"));
		news.setContent(rs.getString("content"));
		return news;
		}catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
