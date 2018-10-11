package com.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

@Component
public class AlumnoDtoValidator {
    public void validate(Object Target, Errors errors){
        AlumnoDto AlumnoDTO = (AlumnoDto)Target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors,"desNom","error.desNom",  "Ingrese los nombre(s) del alumno");

    }

}
