package com.rockywu.nameserver.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/v1/name")
public class NameController {

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String GetName() {

        return "Hi, Rocky!";
    }
}

