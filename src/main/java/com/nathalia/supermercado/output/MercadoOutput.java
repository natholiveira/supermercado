package com.nathalia.supermercado.output;

import com.nathalia.supermercado.domain.Mercado;
import com.nathalia.supermercado.domain.Mercadoria;

import java.util.ArrayList;
import java.util.List;

public class MercadoOutput {

	private Long id;

	private String nome;

	private List<ProdutoDisponivelOutput> produtosDisponiveis = new ArrayList<>();

	public MercadoOutput() {

	}

	public MercadoOutput(Mercado mercado) {
		this.id = mercado.getId();
		this.nome = mercado.getNome();

		for (Mercadoria mercadoria : mercado.getMercadorias()) {
			this.produtosDisponiveis.add(new ProdutoDisponivelOutput(mercadoria));
		}

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

	public List<ProdutoDisponivelOutput> getProdutosDisponiveis() {
		return produtosDisponiveis;
	}

	public void setProdutosDisponiveis(List<ProdutoDisponivelOutput> produtosDisponiveis) {
		this.produtosDisponiveis = produtosDisponiveis;
	}
}
