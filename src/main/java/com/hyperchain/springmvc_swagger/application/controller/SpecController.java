package com.hyperchain.springmvc_swagger.application.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/h")
public class SpecController {
    @RequestMapping("/f")
    public String Task(){
        return "dga";
    }
}
