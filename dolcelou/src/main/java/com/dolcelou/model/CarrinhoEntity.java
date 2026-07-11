package com.dolcelou.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carrinho")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CarrinhoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @Column(nullable = false)
    Integer quantidade;

    @Column(nullable = false)
    BigDecimal preco_produto;

    @Setter
    BigDecimal frete;

    @Setter
    String cep;

    @Column(nullable = false)
    BigDecimal preco_total;

    @OneToOne
    @JoinColumn(name = "id_carrinho")
    @Column(nullable = false)
    String id_acesso;
}
