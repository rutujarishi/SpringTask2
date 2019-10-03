package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Actor  {
    String name;
    String gender ;
    int age ;


    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Actor(){}

    public void print()
    {
        System.out.println("Name:"+ name +  "gender:"+ gender + "Age:" +age);
    }
}