package com.nathalia.supermercado.repository;

import com.nathalia.supermercado.domain.Cliente;
import com.nathalia.supermercado.domain.Mercado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
