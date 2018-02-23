package com.nathalia.supermercado.output;

import com.nathalia.supermercado.domain.Mercadoria;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDisponivelOutput {

	private Long id;

	private String nome;

	private BigDecimal valor;

	public ProdutoDisponivelOutput() {

	}

	public ProdutoDisponivelOutput(Mercadoria mercadoria) {
		this.id = mercadoria.getProduto().getId();
		this.nome = mercadoria.getProduto().getNome();
		this.valor = mercadoria.getValor();
	}

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

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
