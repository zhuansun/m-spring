package org.springframework.beans.factory.config;

import org.springframework.beans.factory.HierarchicalBeanFactory;

/**
 * 提供自定义配置选项，如修改bean属性和注册后处理器，便于在创建bean前进行定制。
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    void addBeanPostProcessor(BeanPostProcessor postProcessor);

    /**
     * 销毁单例bean
     */
    void destroySingletons();
}
