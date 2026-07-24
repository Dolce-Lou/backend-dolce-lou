package com.dolcelou.service;

import org.springframework.stereotype.Service;
import com.dolcelou.model.AcessoEntity;
import com.dolcelou.repository.AcessoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AcessoService {

    private final AcessoRepository acessoRepository;

    public void saveAcess(AcessoEntity acesso) {
        acessoRepository.save(acesso);
    }

    public AcessoEntity getAcessById(String id) {
        return acessoRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Não foi possível achar um produto com esse id"));
    }

    public void deleteAcessById(String id) {
        acessoRepository.deleteById(id);
    }
}
