package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {


@Bean
public Movie getmovie()
{
    return new Movie();

}
    @Bean
    public Actor getactor()
    {
        return new Actor();

    }

{


}


}
