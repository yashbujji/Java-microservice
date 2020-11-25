package com.cc.accelerator.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class ProductDto extends BaseDto {
	private String productName;
	private BigDecimal productPrice;
}