package com.nathalia.supermercado.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "MERCADO")
public class Mercado {

    @Id
    @SequenceGenerator(name = "mercadoSequence", sequenceName = "MERCADO_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "mercadoSequence")
    @Column(name = "ID")
    private Long id;

    @Column (name = "NOME")
    private String nome;

    @OneToMany(mappedBy = "mercado")
    private List<Mercadoria> mercadorias = new ArrayList<>();

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

    public List<Mercadoria> getMercadorias() {
        return mercadorias;
    }

    public void setMercadorias(List<Mercadoria> mercadorias) {
        this.mercadorias = mercadorias;
    }
}
