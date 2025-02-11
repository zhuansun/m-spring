package org.springframework.beans.factory.config;

import org.springframework.beans.factory.BeanFactory;

/**
 * 实现自动依赖注入，根据类型或注解找到合适的bean，简化了手动配置的需求。
 */
public interface AutowireCapableBeanFactory extends BeanFactory {
}
