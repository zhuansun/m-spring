package org.springframework.beans.factory.config;

/**
 * 单例Bean的注册表
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

    void addSingleton(String beanName, Object singletonObject);

}
