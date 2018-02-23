package com.nathalia.supermercado.input;

import com.nathalia.supermercado.domain.ItemVenda;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

public class CompraInput {

    @NotNull
    private String cliente;

    @Valid
    @NotEmpty
    private List<ItemInput> itens = new ArrayList<>();

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<ItemInput> getItens() {
        return itens;
    }

    public void setItens(List<ItemInput> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompraInput{");
        sb.append("cliente='").append(cliente).append('\'');
        sb.append(", itens=").append(itens);
        sb.append('}');
        return sb.toString();
    }
}
