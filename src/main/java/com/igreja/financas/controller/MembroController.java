package com.igreja.financas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembroController {

    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

}
