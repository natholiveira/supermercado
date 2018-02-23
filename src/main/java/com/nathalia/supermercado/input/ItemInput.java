package com.nathalia.supermercado.input;

import com.nathalia.supermercado.validation.MercadoExists;
import com.nathalia.supermercado.validation.ProdutoExists;

public class ItemInput {

    @MercadoExists
    private Long mercado;

    @ProdutoExists
    private Long produto;

    public Long getMercado() {
        return mercado;
    }

    public void setMercado(Long mercado) {
        this.mercado = mercado;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemInput{");
        sb.append("mercado=").append(mercado);
        sb.append(", produto=").append(produto);
        sb.append('}');
        return sb.toString();
    }
}
