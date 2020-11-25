package com.cc.accelerator.util;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import com.cc.accelerator.dto.ErrorDto;

@Component
public final class ApplicationUtils {


	public static String getTTMessages(String key, MessageSource messageSource, Locale locale) {
		return messageSource.getMessage(key, null, locale);
	}

	public static ErrorDto prepareErrorDto(RuntimeException ex, Locale locale, MessageSource messageSource) {
		ErrorDto errorDto;

		errorDto = new ErrorDto(ex.getMessage(), getTTMessages(ex.getMessage(), messageSource, locale));
		return errorDto;
	}

	public static <T> List<T> getPage(List<T> sourceList, int page, int pageSize) {
		if (pageSize <= 0 || page <= 0) {
			throw new IllegalArgumentException("invalid page size: " + pageSize);
		}

		int fromIndex = (page - 1) * pageSize;
		if (sourceList == null || sourceList.size() < fromIndex) {
			return Collections.emptyList();
		}
		return sourceList.subList(fromIndex, Math.min(fromIndex + pageSize, sourceList.size()));
	}

}
