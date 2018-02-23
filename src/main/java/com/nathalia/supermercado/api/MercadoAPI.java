package com.nathalia.supermercado.api;

import com.nathalia.supermercado.domain.Mercado;
import com.nathalia.supermercado.output.MercadoOutput;
import com.nathalia.supermercado.output.wrapper.MercadosOutputWrapper;
import com.nathalia.supermercado.repository.MercadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MercadoAPI {

	@Autowired
	private MercadoRepository mercadoRepository;

	@GetMapping("/mercados")
	public ResponseEntity<?> listar() {

		List<Mercado> mercados = mercadoRepository.findAll();

		return new ResponseEntity<MercadosOutputWrapper>(new MercadosOutputWrapper(mercados), HttpStatus.OK);
	}

}