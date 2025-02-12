package org.springframework.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public interface ApplicationEventMulticaster {

    /**
     * 添加一个监听器
     */
    void addApplicationListener(ApplicationListener<?> listener);


    /**
     * 移除一个监听器
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * 广播一个事件
     */
    void multicastEvent(ApplicationEvent event);


}
