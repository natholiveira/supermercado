package com.nathalia.supermercado.domain;

import javax.persistence.*;
import java.math.BigDecimal;

//@Entity
//@Table(name = "ITEM_VENDA")
public class ItemVenda {

    @Id
    @SequenceGenerator(name = "itemVendaSequence", sequenceName = "ITEM_VENDA_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "itemVendaSequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "PRODUTO")
    private String produto;

    @JoinColumn(name = "VENDA_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_ITEM_VENDA_VENDA"))
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cliente cliente;

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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
}
