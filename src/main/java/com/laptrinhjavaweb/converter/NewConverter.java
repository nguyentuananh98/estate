package com.laptrinhjavaweb.converter;

import org.modelmapper.ModelMapper;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.entity.NewEntity;

public class NewConverter {
	private ModelMapper modelMapper = new ModelMapper();
	
	public NewDTO convertentityToDTO(NewEntity entity) {
		NewDTO news = modelMapper.map(entity, NewDTO.class);
		return news;
	}
	public NewEntity convertDTOtoEntity(NewDTO news) {
		NewEntity entityNew = modelMapper.map(news, NewEntity.class);
		return entityNew;
	}

}
