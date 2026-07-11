package com.dolcelou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dolcelou.model.Relacionamento;

@Repository
public interface RelacionamentoRepository extends JpaRepository<Relacionamento, String>{
}
