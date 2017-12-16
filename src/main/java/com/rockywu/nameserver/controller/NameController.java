package com.rockywu.nameserver.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping(value = "/v1/name")
public class NameController {

    @Value("${com.rockywu.username}")
    private String username;

    @Value("${com.rockywu.age}")
    private int age;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public Human GetHuman() {

//        Map<String, String> map = new HashMap<String, String>();
//        map.put("username", username);
//        map.put("hometown", hometown);
//        map.put("age", age);
        Human human = new Human();
        human.setAge(age);
        human.setUsername(username);

        return human;
    }
}


class Human {
    private String username;
    private int age;

    public void setUsername(String name) {
        this.username = name;
    }

    public String getUsername() {
        return username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


}