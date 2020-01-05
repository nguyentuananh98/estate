package com.laptrinhjavaweb;

import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.impl.NewService;

public class EstateApplication {
	public static void main(String[] args) {
		INewService newService  = new NewService();
		newService.findAll();
//		ICategoryService categoryService = new CategoryService();
//		categoryService.findAll();
	}

}
