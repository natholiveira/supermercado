package com.nathalia.supermercado.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "MERCADORIA")
public class Mercadoria {

    @Id
    @SequenceGenerator(name = "mercadoriaSequence", sequenceName = "MERCADORIA_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "mercadoriaSequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @JoinColumn(name = "PRODUTO_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_MERCADORIA_PRODUTO"))
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Produto produto;

    @JoinColumn(name = "MERCADO_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_CONTA_BANCARIA_MERCADO"))
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Mercado mercado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }
}
