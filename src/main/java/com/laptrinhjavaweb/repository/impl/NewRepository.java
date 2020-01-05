package com.laptrinhjavaweb.repository.impl;

import java.util.List;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.repository.INewRepository;

public class NewRepository extends SimpleJpaRepository<NewEntity> implements INewRepository{

	/*@Override
	public List<NewDTO> findAll() {
		String sql = "select *from news";
		return this.findAll(sql, new NewMapper());
	}*/


}
