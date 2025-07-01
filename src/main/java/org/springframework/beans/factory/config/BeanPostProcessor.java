package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;

/**
 * BeanPostProcessor也是spring提供的容器扩展机制，
 * 不同于BeanFactoryPostProcessor的是，
 * BeanPostProcessor在bean实例化后修改bean或替换bean。
 * BeanPostProcessor是后面实现AOP的关键。
 */
public interface BeanPostProcessor {

    /**
     * 在 Bean 执行初始化方法之前，执行此方法
     */
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;


    /**
     * 在Bean执行初始化方法之后，执行此方法
     */
    Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException;

}
