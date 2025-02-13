package org.springframework.aop;


/**
 * 切点的抽象
 */
public interface Pointcut {


    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
