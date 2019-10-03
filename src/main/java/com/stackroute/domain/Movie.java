package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */

@Component
public class Movie
{
    @Autowired
    Actor actor;

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public  Actor getActor()
    {
        return actor;
    }
    public void print()
    {

        actor.print();

    }








}