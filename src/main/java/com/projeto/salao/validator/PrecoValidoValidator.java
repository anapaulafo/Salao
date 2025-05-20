package com.projeto.salao.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.math.BigDecimal;

public class PrecoValidoValidator implements ConstraintValidator<PrecoValido, BigDecimal> {

    @Override
    public boolean isValid(BigDecimal valor, ConstraintValidatorContext context) {
        return valor != null && valor.compareTo(BigDecimal.ZERO) > 0;
    }
}
