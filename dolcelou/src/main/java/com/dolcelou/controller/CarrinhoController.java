package com.dolcelou.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dolcelou.model.CarrinhoEntity;
import com.dolcelou.service.CarrinhoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/carrinho")
@RequiredArgsConstructor
public class CarrinhoController {
    
    private final CarrinhoService service;

    @PostMapping("/create")
    public CarrinhoEntity createCarrinho(@RequestBody CarrinhoEntity entity) {
        return service.saveCarrinho(entity);
    }

    @GetMapping("/find/{id}")
    public CarrinhoEntity getCarrinho(@PathVariable String id) {
        return service.getCarrinho(id);
    }
}
