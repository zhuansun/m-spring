package org.springframework.beans.factory.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * BeanFactoryPostProcessor是spring提供的容器扩展机制，允许我们在bean实例化之前修改bean的定义信息即BeanDefinition的信息。
 * 重要的实现类
 * PropertyPlaceholderConfigurer的作用是用properties文件的配置值替换xml文件中的占位符，
 * CustomEditorConfigurer的作用是实现类型转换。
 */
public interface BeanFactoryPostProcessor {


    /**
     * 在所有BeanDefinition加载完成后，在实例化Bean之前，提供修改 BeanDefinition属性值的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
