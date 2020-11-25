package com.cc.accelerator.logging;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class CoreLogger {
	@Around("@annotation(EntryExitLogger)")
	public Object logAround(ProceedingJoinPoint joinPoint) throws Throwable {
		Object response = null;
		String method = joinPoint.getSignature().toShortString();
		try {
			log.info("Start - {}", method);
			response = joinPoint.proceed();
			log.info("End - {}", method);
			return response;
		} catch (Exception e) {
			log.error("Exception while invoking method - {}", method, e);
			throw e;
		}
	}
}
