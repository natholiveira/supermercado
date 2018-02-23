package com.nathalia.supermercado.repository;

import com.nathalia.supermercado.domain.Cliente;
import com.nathalia.supermercado.domain.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {

}
