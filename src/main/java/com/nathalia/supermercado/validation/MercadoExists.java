package com.nathalia.supermercado.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MercadoExistsValidator.class)
@Documented
public @interface MercadoExists {

    String message() default "{constraints.mercadoexists}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}