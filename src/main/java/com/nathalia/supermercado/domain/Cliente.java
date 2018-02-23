package com.nathalia.supermercado.domain;

import javax.persistence.*;

//@Entity
//@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @SequenceGenerator(name = "clienteSequence", sequenceName = "CLIENTE_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "clienteSequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
