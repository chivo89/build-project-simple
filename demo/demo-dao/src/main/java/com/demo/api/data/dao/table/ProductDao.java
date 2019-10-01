package com.demo.api.data.dao.table;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.demo.api.data.entity.Product;



@Dao
@ConfigAutowireable
public interface ProductDao{

	@Select
	List<Product> selectAll();

}
