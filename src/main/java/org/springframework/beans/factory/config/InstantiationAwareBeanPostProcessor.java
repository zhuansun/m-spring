package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;


/**
 *
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{


    /**
     * 在Bean实例化之前执行
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

}
