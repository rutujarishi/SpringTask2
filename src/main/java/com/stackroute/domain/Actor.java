package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor  {
    @Value("Priyanka")
    String name;
    @Value("Female")
    String gender ;
    @Value("34")
    int age ;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public Actor(){}

    public void print()
    {
        System.out.println("Name:"+ name +  "gender:"+ gender + "Age:" +age);
    }
}