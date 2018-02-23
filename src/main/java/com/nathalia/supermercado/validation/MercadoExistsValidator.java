package com.nathalia.supermercado.validation;

import com.nathalia.supermercado.domain.Mercado;
import com.nathalia.supermercado.repository.MercadoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MercadoExistsValidator implements ConstraintValidator<MercadoExists, Object> {

    @Autowired
    private MercadoRepository mercadoRepository;

    @Override
    public void initialize(MercadoExists arg0) {

    }

    @Override
    public boolean isValid(Object arg0, ConstraintValidatorContext arg1) {

        if(arg0 == null || ((Long) arg0) <= 0) {
            return false;
        }

        Mercado mercado = mercadoRepository.findOne((Long) arg0);

        if(mercado == null) {
            return false;
        }

        return true;
    }

}
