package com.stackroute.domain;

import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.stackroute.domain")
public class Config {
//    }
    @Bean
        public BeanLifecycleDemoBean getBeanlifecycleDemoBean()
        {
            return new BeanLifecycleDemoBean();

        }
//    @Bean
//    public Actor getActor1()
//    {
//        return new Actor("Priyanka","Female",34);
//    }
}


