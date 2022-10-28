package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class IndexController
{
    @GetMapping("/api")
    public String get(@RequestParam(value = "input") String input)
    {
        return "GET REQUEST with input: " + input;
    }

    @PostMapping("/api")
    public String post(@RequestBody Map<String, String> request)
    {
        for(String key: request.keySet())
        {
            System.out.println(key + ": " + request.get(key));
        }
        return "POST REQUEST";
    }

    @PutMapping("/api")
    public String put(@RequestBody Map<String, String> request)
    {
        for(String key: request.keySet())
        {
            System.out.println(key + ": " + request.get(key));
        }
        return "PUT REQUEST";
    }

    @DeleteMapping("/api")
    public String delete()
    {
        return "DELETE REQUEST";
    }
}
