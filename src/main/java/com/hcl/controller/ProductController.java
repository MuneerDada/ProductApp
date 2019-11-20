package com.hcl.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.DTO.ProductDTO;
import com.hcl.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService service;
	
	@RequestMapping(value = "/products",method = RequestMethod.GET)
	
	protected ModelAndView productsList(Model model) {
		
	List<ProductDTO> listProduct=service.listProducts();
		model.addAttribute("listProducts",listProduct );
		return new ModelAndView("listProducts", "products", listProduct);
		
	}
	

}
