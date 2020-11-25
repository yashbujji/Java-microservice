package com.cc.accelerator.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserDto extends BaseDto {
	private Long id;
	@NotBlank(message = "firstName is required")
	private String firstName;
	@NotBlank(message = "lastName is required")
	private String lastName;
	@Min(value = 1, message = "Age must be greater than zero")
	private Integer age;
	@NotBlank(message = "address is required")
	private String address;
	private List<ProductDto> products = new ArrayList<>();
}
