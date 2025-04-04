package com.andriele.desafio_todolist.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id;


    @Column(name = "nome")
    @Getter
    @Setter
    private String nome;

    @Column(name = "descricao")
    @Getter
    @Setter
    private String descricao;

    @Column(name = "realizado")
    @Getter
    @Setter
    private boolean realizado = false;

    @Column(name = "prioridade")
    @Getter
    @Setter
    private Integer prioridade;

    
}
