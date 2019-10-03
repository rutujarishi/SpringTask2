package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */


public class Movie 
{
    @Autowired
    public Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }


//    public Movie(Actor actor) {
//        this.actor = actor;
//    }



    public Movie(){

    }


    public void print() {
        actor.print();

    }



}