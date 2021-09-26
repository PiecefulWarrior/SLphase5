package com.sample.aws.controller;

import com.sample.aws.model.CountryList;
import com.sample.aws.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestRepos {

    @Autowired
    CountryList countryList;

    @GetMapping("users/{country}")
    public List<Users> getCountries(@PathVariable("country")String country){

        return countryList.hm.get(country);

    }

}
