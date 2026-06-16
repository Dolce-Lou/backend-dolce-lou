package com.dolcelou.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produto")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProdutoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @Column(nullable = false)
    String nome;

    @Column(nullable = false)
    BigDecimal preco;

    @Column(nullable = false)
    Integer medida;

    @Column(nullable = false)
    String descricao;

    @Column(nullable = false)
    Integer quantidade;
}
