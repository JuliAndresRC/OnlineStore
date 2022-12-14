package com.store.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NameValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {


    String message() default "El Nombre es invalido";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}

