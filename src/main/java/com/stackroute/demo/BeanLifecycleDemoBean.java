package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    

    @PostConstruct
    public void customInit()
    {
        System.out.println("customInit");
    }

    @PreDestroy
    public void customDestroy()
    {
        System.out.println("destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Init method after properties are set : ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }
}
