package com.dolcelou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dolcelou.model.AcessoEntity;
import com.dolcelou.service.AcessoService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("v1/acesso")
@RequiredArgsConstructor
public class AcessoController {
    
    private final AcessoService service;

    @GetMapping("/find/{id}")
    public AcessoEntity getAcessById(@PathVariable String id) {
        return service.getAcessById(id);
    }

    @PostMapping("/create")
    public void createAcess(@RequestBody AcessoEntity entity) {
        service.saveAcess(entity);
    }
    
    @GetMapping("/delete/{id}")
    public void deleteAcessById(@PathVariable String id) {
        service.deleteAcessById(id);
    }
    
}
