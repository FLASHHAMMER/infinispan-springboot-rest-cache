package com.cache.infini.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("hello")
public class TestHelloController {

    @GetMapping
    public Map<String, String> hello(){
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "human!");
        return map;
    }

}
