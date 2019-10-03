package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Hello world!
 *
 */


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
        actor.setName("Deepika");
        actor.setGender("Female");
        actor.setAge(29);


        actor.print();

    }








}