package com.sample.aws.model;

import org.springframework.stereotype.Component;

@Component
public class Users {

    public String name;
    public String city;

    public Users(){

    }
    public Users(String name, String city) {
        this.name = name;
        this.city = city;
    }

}
