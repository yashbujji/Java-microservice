package com.cc.accelerator.dto;

import java.util.List;

import lombok.Data;

@Data
public class GenericResponse {
	private boolean success;
	private Object data;
	private List<ErrorDto> errors;
}
