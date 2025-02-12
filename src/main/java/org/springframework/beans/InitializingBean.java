package org.springframework.beans;

public interface InitializingBean {

    void afterPropertiesSet() throws Exception;

}
