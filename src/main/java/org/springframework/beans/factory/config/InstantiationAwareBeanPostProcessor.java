package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;


/**
 *
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor {


    /**
     * 在Bean实例化之前执行
     */
    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;


    /**
     * bean实例化之后，设置属性之前执行
     */
    PropertyValues postProcessPropertyValues(PropertyValues pvs, Object bean, String beanName) throws BeansException;


}
