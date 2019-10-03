package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class Config {


    @Bean
    @Scope("prototype")
    public Movie getmovie() {
        return new Movie(getActor());
    }
    @Bean
        public Actor getActor()
        {
            return new Actor("Deepika","Female",29);

        }
//    @Bean
//    public Actor getActor1()
//    {
//        return new Actor("Priyanka","Female",34);
//    }

}
