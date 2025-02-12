package org.springframework.context;


/**
 * 事件发布者接口
 */
public interface ApplicationEventPublisher {

    void publishEvent(ApplicationEvent event);

}
