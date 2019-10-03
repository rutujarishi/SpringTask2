package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */


public class Movie
{

    public Actor actor;
    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Movie(){

    }


    public void print() {
        actor.print();

    }


}