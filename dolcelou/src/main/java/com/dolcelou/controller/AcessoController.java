package com.dolcelou.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("v1/acesso")
public class AcessoController {
    
    @GetMapping("/{id}")
    public String getMethodName(@PathVariable String id) {
        return new String();
    }
    
}
