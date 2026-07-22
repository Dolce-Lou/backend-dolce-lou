package com.dolcelou.service;

import org.springframework.stereotype.Service;

import com.dolcelou.model.CarrinhoEntity;
import com.dolcelou.repository.CarrinhoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CarrinhoService {

    private final CarrinhoRepository carrinhoRepository;

    public CarrinhoEntity saveCarrinho(CarrinhoEntity carrinho) {
        return carrinhoRepository.save(carrinho);
    }

    public CarrinhoEntity getCarrinho(String id) {
        return carrinhoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Nenhum carrinho com esse id"));
    }
    
}
