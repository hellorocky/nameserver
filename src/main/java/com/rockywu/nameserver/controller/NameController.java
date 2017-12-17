package com.rockywu.nameserver.controller;


import com.sun.corba.se.spi.ior.ObjectKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRequest;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/v1/name")
public class NameController {

    @Value("${com.rockywu.username}")
    private String username;

    @Value("${com.rockywu.age}")
    private int age;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Map<String, Object>> GetHuman() {

        List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from var_name ORDER BY RAND() LIMIT 1");
        return list;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Map<String, Object> PostHuman(@RequestBody Map<String, Object> request) {
        System.out.println(request);
        return request;
    }


}


