package org.springframework.beans.factory.support;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class SimpleInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        Class beanClass = beanDefinition.getBeanClass();
        try {
            /*
				为什么用这种方式，而不是直接 beanClass.newInstance()
				因为这种方式只能默认调用当前类的无参构造函数，如果当前类没有无参构造函数，则会抛出异常
				使用下面这种方式，会先获取构造器，通过构造器实例化，就避免了上面的问题。
				另外，在Java9之后，上面哪种方式已经废弃了。
			 */
            Constructor constructor = beanClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw new BeansException("Failed to instantiate [" + beanClass.getName() + "]", e);
        }
    }
}
