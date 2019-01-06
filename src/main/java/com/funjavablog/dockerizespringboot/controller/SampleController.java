package com.funjavablog.dockerizespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping(value = "/test")
    public String getTestValue(){
        return "SampleController - test works";
    }

}
