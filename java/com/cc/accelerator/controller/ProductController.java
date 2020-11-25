package com.cc.accelerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.service.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	private final ProductService productService;

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("v1.0/getAllProducts")
	public ResponseEntity<GenericResponse> getAllProductsV1_0() {
		return ResponseEntity.ok(productService.getAllProductsV1_0());
	}

	@GetMapping("v1.1/getAllProducts")
	public ResponseEntity<GenericResponse> getAllProductsV1_1() {
		return ResponseEntity.ok(productService.getAllProductsV1_1());
	}

	@GetMapping(value = "getAllProducts", headers = "X-API-VERSION=1")
	public ResponseEntity<GenericResponse> getAllProductsHeadersV1_1() {
		return ResponseEntity.ok(productService.getAllProductsHeadersV1_1());
	}

	@GetMapping(value = "getAllProducts", headers = "X-API-VERSION=2")
	public ResponseEntity<GenericResponse> getAllProductsHeadersV1_2() {
		return ResponseEntity.ok(productService.getAllProductsHeadersV1_2());
	}
	
	@GetMapping(value = "getAllProducts", produces = "application/vnd.cc.app-v1+json")
		public ResponseEntity<GenericResponse> getAllProductsContentNegotiationV1() {
		return ResponseEntity.ok(productService.getAllProductsHeadersV1_1());
	}
	
	@GetMapping(value = "getAllProducts", produces = "application/vnd.cc.app-v2+json")
	public ResponseEntity<GenericResponse> getAllProductsContentNegotiationV2() {
	return ResponseEntity.ok(productService.getAllProductsHeadersV1_2());
}
}
