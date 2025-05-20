package com.projeto.salao.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PrecoValidoValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PrecoValido {
    String message() default "O preço deve ser maior que zero";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
