package org.demo.web.app.resource;

import java.util.ArrayList;
import java.util.List;

import org.demo.core.util.ObjectMapperUtils;
import org.demo.service.dto.ProductDto;
import org.demo.service.logic.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/web/api/product")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@RequestMapping(path="/searchAll", method=RequestMethod.GET)
	public List<ProductDto> searchAllProduct(){
//		return ObjectMapperUtils.mapAll(this.productService.searchAllProducts(), ProductDto.class);
		return new ArrayList<>();
	}


}
