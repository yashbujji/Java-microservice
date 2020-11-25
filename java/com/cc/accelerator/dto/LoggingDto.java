package com.cc.accelerator.dto;

import java.time.Instant;

import lombok.Data;

@Data
public class LoggingDto {
	
	private String id;
	private String name;
	private String version;
	private String product;
	private Instant currentdate;
	private String action;
	private String url;
	private String flowName;
	private String comment;
}
