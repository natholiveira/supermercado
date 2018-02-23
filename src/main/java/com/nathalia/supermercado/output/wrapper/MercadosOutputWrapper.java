package com.nathalia.supermercado.output.wrapper;


import com.nathalia.supermercado.domain.Mercado;
import com.nathalia.supermercado.output.MercadoOutput;

import java.util.ArrayList;
import java.util.List;

public class MercadosOutputWrapper {

	private List<MercadoOutput> mercados = new ArrayList<>();

	public MercadosOutputWrapper() {

	}

	public MercadosOutputWrapper(List<Mercado> mercados) {

		for (Mercado mercado : mercados) {

			this.mercados.add(new MercadoOutput(mercado));

		}

	}

	public List<MercadoOutput> getMercados() {
		return mercados;
	}

	public void setMercados(List<MercadoOutput> mercados) {
		this.mercados = mercados;
	}
}
