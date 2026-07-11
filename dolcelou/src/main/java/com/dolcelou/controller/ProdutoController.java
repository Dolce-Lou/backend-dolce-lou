package com.dolcelou.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dolcelou.model.ProdutoEntity;
import com.dolcelou.service.ProdutoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("v1/carrinho")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping("/find/{id}")
    public ProdutoEntity findProductByID(@PathVariable String id) {
        return service.findProductById(id);
    }
    
    @PostMapping("/create")
    public ProdutoEntity createProduct(@RequestBody ProdutoEntity entity) {        
        return service.saveProduct(entity);
    }
    
    @PutMapping("update/{id}")
    public ProdutoEntity updateProduct(@PathVariable String id, @RequestBody ProdutoEntity entity) {
        return service.updateProduct(id, entity);
    }

    @GetMapping("/findAll")
    public List<ProdutoEntity> findAll() {
        return service.findAllProducts();
    }
    
    @GetMapping("/delete")
    public void deleteProduct(@PathVariable String id) {
        service.deleteProductById(id);
    }
}