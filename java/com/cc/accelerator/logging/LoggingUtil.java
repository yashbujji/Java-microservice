package com.cc.accelerator.logging;

import com.cc.accelerator.dto.LoggingDto;

public class LoggingUtil {
	
	public static LoggingDto createLoggingDto(Object objectToLog) {
		LoggingDto dto = new LoggingDto();
		//dto.setId(objectToLog.getId());
		dto.setComment(objectToLog.toString());
		return dto;
	}

}
