package com.demo.demo_service_impl;

import java.util.List;

import org.demo.core.util.ObjectMapperUtils;
import org.demo.service.dto.ProductDto;
import org.demo.service.logic.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;

import com.demo.api.data.dao.ProductDao;
import com.demo.api.data.entity.Product;

public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;
	@Override
	public List<ProductDto> searchAllProducts() {
		List<Product> products = productDao.selectAll();
		return ObjectMapperUtils.mapAll(products, ProductDto.class);
	}

}
