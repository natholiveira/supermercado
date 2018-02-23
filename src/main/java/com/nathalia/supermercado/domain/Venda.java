package com.nathalia.supermercado.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

//@Entity
//@Table(name = "VENDA")
public class Venda {

    @Id
    @SequenceGenerator(name = "vendaSequence", sequenceName = "VENDA_SEQUENCE")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "vendaSequence")
    @Column(name = "ID")
    private Long id;

    @JoinColumn(name = "MERCADO_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_VENDA_MERCADO"))
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Mercado mercado;

    @JoinColumn(name = "CLIENTE_ID", referencedColumnName = "ID", foreignKey = @ForeignKey(name = "FK_VENDA_CLIENTE"))
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cliente cliente;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @OneToMany(mappedBy = "itemVenda")
    private Set<ItemVenda> itensVendas = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public void setMercado(Mercado mercado) {
        this.mercado = mercado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Set<ItemVenda> getItensVendas() {
        return itensVendas;
    }

    public void setItensVendas(Set<ItemVenda> itensVendas) {
        this.itensVendas = itensVendas;
    }
}
