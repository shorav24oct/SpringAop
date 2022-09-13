package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allGetters()")
	public void loggingAdvice() {
		System.out.println("Before Advice run. Get Method called");
	}

	@Before("allGetters()")
	public void secondAdvice() {
		System.out.println("second Advice Before Advice run. Get Method called");
	}

	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

}
