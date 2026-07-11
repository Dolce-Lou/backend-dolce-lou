package com.dolcelou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dolcelou.model.CarrinhoEntity;

@Repository
public interface CarrinhoRepository extends JpaRepository<CarrinhoEntity, String>{
}
