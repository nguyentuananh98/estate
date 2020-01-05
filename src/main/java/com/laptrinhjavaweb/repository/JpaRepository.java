package com.laptrinhjavaweb.repository;

import java.util.List;
import com.laptrinhjavaweb.mapper.RowMapper;


public interface JpaRepository<T> {
	List<T> findAll();
}
