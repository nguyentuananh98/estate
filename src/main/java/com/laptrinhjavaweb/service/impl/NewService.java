package com.laptrinhjavaweb.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.laptrinhjavaweb.converter.NewConverter;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.repository.INewRepository;
import com.laptrinhjavaweb.repository.impl.NewRepository;
import com.laptrinhjavaweb.service.INewService;

public class NewService implements INewService{
	private INewRepository newRepository = new NewRepository();
	private NewConverter newConverter  = new NewConverter();
	@Override
	public List<NewDTO> findAll() {
		List<NewDTO> results = new ArrayList<>();
		@SuppressWarnings("unused")
		List<NewEntity> entities = newRepository.findAll();
		//convert entity->DTO
		for(NewEntity item: entities) {
			NewDTO news = newConverter.convertentityToDTO(item);
			results.add(news);
		}
		return results;
		//return newRepository.findAll();
	}

}
