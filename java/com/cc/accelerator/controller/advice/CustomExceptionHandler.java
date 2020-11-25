package com.cc.accelerator.controller.advice;

import static com.cc.accelerator.util.ApplicationUtils.prepareErrorDto;
import static com.cc.accelerator.util.ConvertUtil.getErrorGenericResponse;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cc.accelerator.dto.ErrorDto;
import com.cc.accelerator.dto.GenericResponse;
import com.cc.accelerator.exception.ExceptionCode;
import com.cc.accelerator.exception.UserException;
import com.cc.accelerator.util.ApplicationUtils;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	MessageSource messageSource;

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		return ResponseEntity.badRequest()
				.body(getErrorGenericResponse(ex.getBindingResult().getFieldErrors().stream()
						.map(fe -> new ErrorDto(ApplicationUtils.getTTMessages(ExceptionCode.EX_CODE_MANDATORY,
								messageSource, LocaleContextHolder.getLocale()), fe.getDefaultMessage()))
						.collect(toList())));
	}

	@ExceptionHandler(UserException.class)
	public ResponseEntity<GenericResponse> handleUserManagmentException(RuntimeException exception, Locale locale) {
		return ResponseEntity.accepted()
				.body(getErrorGenericResponse(asList(prepareErrorDto(exception, locale, messageSource))));
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<GenericResponse> handleException(RuntimeException exception, Locale locale) {
		return ResponseEntity.badRequest()
				.body(getErrorGenericResponse(asList(prepareErrorDto(exception, locale, messageSource))));
	}
}
