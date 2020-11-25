package com.cc.accelerator.util;

import static java.lang.Boolean.TRUE;
import static org.springframework.beans.BeanUtils.copyProperties;

import java.util.List;
import java.util.stream.Collectors;

import com.cc.accelerator.dto.ErrorDto;
import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.dto.ProductDto;
import com.cc.accelerator.dto.UserDto;
import com.cc.accelerator.entity.Product;
import com.cc.accelerator.entity.User;

public class ConvertUtil {

	private ConvertUtil() {
	}

	public static User convertDtoToEntity(UserDto dto) {
		final User entity = new User();
		copyProperties(dto, entity);
		entity.setProducts(dto.getProducts().stream().map(pr -> {
			Product product = new Product();
			product.setProductName(pr.getProductName());
			product.setProductPrice(pr.getProductPrice());
			return product;
		}).collect(Collectors.toList()));
		return entity;
	}

	public static UserDto convertEntityToDto(User entity) {
		UserDto dto = new UserDto();
		copyProperties(entity, dto);
		dto.setProducts(entity.getProducts().stream().map(pr -> {
			ProductDto productDto = new ProductDto();
			productDto.setProductName(pr.getProductName());
			productDto.setProductPrice(pr.getProductPrice());
			return productDto;
		}).collect(Collectors.toList()));
		return dto;
	}

	public static GenericResponse getGenericResponse(Object data) {
		GenericResponse response = new GenericResponse();
		response.setSuccess(TRUE);
		response.setData(data);
		return response;
	}

	public static GenericResponse getErrorGenericResponse(List<ErrorDto> errors) {
		GenericResponse response = new GenericResponse();
		response.setErrors(errors);
		return response;
	}
}
