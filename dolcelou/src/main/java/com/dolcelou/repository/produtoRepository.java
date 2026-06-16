package com.dolcelou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dolcelou.model.ProdutoEntity;

@Repository
public interface produtoRepository extends JpaRepository<ProdutoEntity, String>{
}
