package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

/**
 * 用于定义Bean类型的信息， 包含bean的class类型，构造参数，属性值 等信息
 * 每个 Bean 对应一个BeanDefinition的实例
 * 这里简化了 BeanDefinition 只包含了bean 的class类型
 */
public class BeanDefinition {

    private Class beanClass;

    private PropertyValues propertyValues;


    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

}
