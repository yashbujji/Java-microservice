package com.cc.accelerator.service.impl;
import static com.cc.accelerator.util.ConvertUtil.getGenericResponse;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.entity.Product;
import com.cc.accelerator.exception.ExceptionCode;
import com.cc.accelerator.exception.ProductException;
import com.cc.accelerator.repository.ProductRepository;
import com.cc.accelerator.service.ProductService;
	
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
 
	@Autowired
	ProductRepository productRepository ;
	
    @Override
    public GenericResponse  getAllProductsV1_0() {
    	List<Product> productlist= productRepository.findAll();
    	List<String> productname = productlist.stream().map(r-> r.getProductName()).collect(Collectors.toList());
        return  getGenericResponse(productname);
    }
    
    @Override
    public GenericResponse  getAllProductsV1_1() {
        return  getGenericResponse(productRepository.findAll());
    }
 
    @Override
    public Product getProduct(long id) {
    	Optional<Product> product= productRepository.findById(id);
    	if(!product.isPresent())
    		throw new ProductException(ExceptionCode.PRODUCT_ID_INVALID);
        return productRepository.findById(id).get();
          
    }
 
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

	@Override
	public GenericResponse getAllProductsHeadersV1_1() {
		// TODO Auto-generated method stub
		 return  getGenericResponse(productRepository.findAll());
	}
	
	@Override
	public GenericResponse getAllProductsHeadersV1_2() {
		List<Product> productlist= productRepository.findAll();
    	Map<String,BigDecimal> prodMap= new HashMap<>();
		for(Product product : productlist) {
			prodMap.put(product.getProductName(), product.getProductPrice());
    	}
		 return  getGenericResponse(prodMap);
	}

}
