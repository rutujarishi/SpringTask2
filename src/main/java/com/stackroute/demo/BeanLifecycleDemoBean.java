package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @PostConstruct
    public void CustomInit()
    {
        System.out.println("CustomInit");
    }
    @PreDestroy
    public void CustomDestroy()
    {
        System.out.println("Destroy");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : " + message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
}
