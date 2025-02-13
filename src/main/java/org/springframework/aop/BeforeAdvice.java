package org.springframework.aop;

import org.aopalliance.aop.Advice;

import java.lang.reflect.Method;

public interface BeforeAdvice extends Advice {

    void before(Method method, Object[] args, Object target) throws Throwable;

}
