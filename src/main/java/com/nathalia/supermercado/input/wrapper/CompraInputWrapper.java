package com.nathalia.supermercado.input.wrapper;

import com.nathalia.supermercado.input.CompraInput;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class CompraInputWrapper {

    @Valid
    @NotNull
    private CompraInput compra;

    public CompraInput getCompra() {
        return compra;
    }

    public void setCompra(CompraInput compra) {
        this.compra = compra;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CompraInputWrapper{");
        sb.append("compra=").append(compra);
        sb.append('}');
        return sb.toString();
    }
}
