package com.example.demo.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
public class IndexController
{
    @GetMapping("/api")
    public Map<String, String> get(@RequestParam(value = "input") String input)
    {
        return new HashMap<String, String>(){{put("input", input);}};
    }

    @PostMapping("/api")
    public Map<String, Map<String, String>> post(@RequestBody Map<String, String> request)
    {
        return new HashMap<String, Map<String, String>>(){{put("input", request);}};
    }

    @PutMapping("/api")
    public Map<String, Map<String, String>> put(@RequestBody Map<String, String> request)
    {
        return new HashMap<String, Map<String, String>>(){{put("input", request);}};
    }

    @DeleteMapping("/api")
    public Map<String, String> delete(@RequestParam(value = "input") String input)
    {
        return new HashMap<String, String>(){{put("input", input);}};
    }
}
