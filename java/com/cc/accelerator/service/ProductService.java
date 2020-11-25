package com.cc.accelerator.service;

import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.entity.Product;

public interface ProductService {

	GenericResponse getAllProductsV1_0();
	GenericResponse getAllProductsV1_1();

	Product getProduct(long id);

	Product save(Product product);
	GenericResponse getAllProductsHeadersV1_1();
	GenericResponse getAllProductsHeadersV1_2();

}
