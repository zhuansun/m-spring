package org.springframework.beans.factory.config;

import org.springframework.beans.PropertyValues;

/**
 * 用于定义Bean类型的信息， 包含bean的class类型，构造参数，属性值 等信息
 * 每个 Bean 对应一个BeanDefinition的实例
 * 这里简化了 BeanDefinition 只包含了bean 的class类型
 */
public class BeanDefinition {

    /**
     * 单例Bean
     * 在Spring容器中只会存在一个实例
     * 对于一个对象来说，如果是无状态的，使用单例Bean性能更好
     */
    public static String SCOPE_SINGLETON = "singleton";

    /**
     * 原型Bean
     * 每次getbean的时候都是创建新的实例
     * 如果一个对象，是有状态的，那么只能使用原型Bean了
     */
    public static String SCOPE_PROTOTYPE = "prototype";

    /**
     * 当前Bean的类型
     */
    private Class beanClass;

    /**
     * 当前Bean的属性值
     */
    private PropertyValues propertyValues;

    /**
     * 初始化方法的名称
     */
    private String initMethodName;

    /**
     * 销毁方法的名称
     */
    private String destroyMethodName;

    /**
     * 作用域
     */
    private String scope = SCOPE_SINGLETON;


    /**
     * 是否是单例Bean
     */
    private boolean singleton = true;

    /**
     * 是否是原型Bean
     */
    private boolean prototype = false;

    public BeanDefinition(Class beanClass) {
        this(beanClass, null);
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public void setScope(String scope) {
        this.scope = scope;
        this.singleton = SCOPE_SINGLETON.equals(scope);
        this.prototype = SCOPE_PROTOTYPE.equals(scope);
    }

    public boolean isSingleton() {
        return this.singleton;
    }

    public boolean isPrototype() {
        return this.prototype;
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

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
}
