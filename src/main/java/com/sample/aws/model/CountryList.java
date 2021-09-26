package com.sample.aws.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class CountryList {

    @Autowired
    Users user;
    public static HashMap<String, List<Users>> hm = new HashMap();

    static{

        hm = new HashMap();
        List<Users> ul = new ArrayList<>();

        ul.add(new Users("Bhushan","Pune"));
        ul.add(new Users("Vaibhav","Mumbai"));
        ul.add(new Users("Yash","Nagpur"));

        hm.put("india",ul);

        List<Users> ul1 = new ArrayList<>();

        ul1.add(new Users("Sam","California"));
        ul1.add(new Users("Jay","Phoenix"));
        ul1.add(new Users("Dan","Mexico"));

        hm.put("us",ul1);

    }

}
