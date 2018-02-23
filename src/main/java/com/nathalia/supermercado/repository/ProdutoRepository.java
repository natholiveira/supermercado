package com.nathalia.supermercado.repository;

import com.nathalia.supermercado.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
