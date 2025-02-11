package org.springframework.core.io;


/**
 * ResourceLoader接口则是资源查找定位策略的抽象，DefaultResourceLoader是其默认实现类
 */
public interface ResourceLoader {

    Resource getResource(String location);

}
