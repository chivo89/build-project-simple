package com.demo.api.data.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@EqualsAndHashCode(callSuper = false)
@Builder
@Data
public class Product{
	/** コインID */
	@Id
	private java.lang.String id;
	/** 送信者ID */
	private java.lang.String name;
	public Product() {
	}

	public Product(java.lang.String id, java.lang.String name) {
		this.id = id;
		this.name = name;
	}

}
