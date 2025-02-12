package org.springframework.beans;

public interface DisposableBean {

    void destroy() throws Exception;

}
