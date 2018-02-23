package com.nathalia.supermercado.repository;

import com.nathalia.supermercado.domain.Cliente;
import com.nathalia.supermercado.domain.Mercadoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MercadoriaRepository extends JpaRepository<Mercadoria, Long> {

    boolean existsByProduto_idAndMercado_id(Long produtoId, Long mercadoId);
}
