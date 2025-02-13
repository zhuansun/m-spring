package org.springframework.aop;

public interface PointCutAdvisor extends Advisor {

    Pointcut getPointCut();

}
