package org.springframework.beans.factory;


import org.springframework.beans.BeansException;

import java.util.Map;

/**
 * 扩展了BeanFactory，允许列出所有bean，便于在应用中获取bean列表或按类型检索。
 */
public interface ListableBeanFactory extends BeanFactory {


    /**
     * 返回指令类型的所有bean实例
     * @param type
     * @return
     * @param <T>
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;


    /**
     * 返回定义的所有bean的名称
     * @return
     */
    String[] getBeanDefinitionNames();

}
