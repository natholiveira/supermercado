package com.nathalia.supermercado.repository;

import com.nathalia.supermercado.domain.Cliente;
import com.nathalia.supermercado.domain.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {

}
