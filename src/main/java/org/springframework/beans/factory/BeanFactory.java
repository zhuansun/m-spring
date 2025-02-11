package org.springframework.beans.factory;

import org.springframework.beans.BeansException;

/**
 * bean工厂
 * 作为核心接口，定义了管理bean生命周期的基本方法，如创建、查找等，为其他工厂提供基础。
 */
public interface BeanFactory {

    /**
     * 获取bean
     * @param name bean的名字
     * @return bean实例
     * @throws BeansException 当bean不存在的时候
     */
    Object getBean(String name) throws BeansException;

}
