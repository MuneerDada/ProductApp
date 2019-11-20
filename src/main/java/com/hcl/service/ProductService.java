package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.DTO.ProductDTO;
import com.hcl.dao.ProductDAO;
import com.hcl.model.Product;

public class ProductService {

	@Autowired
	private ProductDAO prod;

	public List<ProductDTO> listProducts() {

		List<Product> listModel = prod.findAll();

		List<ProductDTO> listDto = new ArrayList();

		for (Product model : listModel) {

			ProductDTO pdto = new ProductDTO();
			pdto.setProduct_id(model.getProduct_id());
			pdto.setProduct_name(model.getProduct_name());
			pdto.setProduct_price(model.getProduct_price());

		}
		return listDto;
	}
}
