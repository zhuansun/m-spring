package org.springframework.beans.factory;


import org.springframework.beans.BeansException;

/**
 * 实现该接口，能感知其所属的BeanFactory
 */
public interface BeanFactoryAware extends Aware {

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;


}
