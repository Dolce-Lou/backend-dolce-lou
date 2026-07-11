package com.dolcelou.model;

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
@Table(name = "acesso")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AcessoEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String id;

    @Column(nullable = false)
    String email;

    @Column(nullable = false)
    String senha;

    @Column(nullable = false)
    Acesso acesso;

    public enum Acesso {
        FUNCIONARIO,
        COMPRADOR
    }
}
