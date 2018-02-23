package com.nathalia.supermercado.validation;

import com.nathalia.supermercado.domain.Produto;
import com.nathalia.supermercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ProdutoExistsValidator implements ConstraintValidator<ProdutoExists, Object> {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void initialize(ProdutoExists arg0) {

    }

    @Override
    public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {

        if(arg0 == null || ((Long) arg0) <= 0) {
            return false;
        }

        Produto produto = produtoRepository.findOne((Long) arg0);

        if(produto == null) {
            return false;
        }

        return true;
    }

}
