package org.demo.web.resource;

import org.demo.service.logic.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web/api/product")
public class ProductResource {

	@Autowired
	private ProductService productService;


}
