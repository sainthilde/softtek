package com.softtek.estudiantes.infrastructure.api.controller;

import com.softtek.estudiantes.openapi.model.ExceptionDto;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;


@RestController
@ControllerAdvice

public class ExceptionHandlerControllerAdvice {
    @ExceptionHandler(value = ConstraintViolationException.class)
    public ResponseEntity<ExceptionDto> handleConstraintViolationException(
            ConstraintViolationException exception) {
        return new ResponseEntity<>(
                new ExceptionDto()
                        .code("0001")
                        .description(exception.getMessage())
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity<ExceptionDto> handleMissingServletRequestParameterException(
            MissingServletRequestParameterException exception){
        return new ResponseEntity<>(
                new ExceptionDto()
                        .code("0002")
                        .description(exception.getMessage())
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }



    @ExceptionHandler(value = Throwable.class)
    public ResponseEntity<ExceptionDto> handleThrowable(
            Throwable exception) {
        return new ResponseEntity<>(
                new ExceptionDto()
                        .code("0004")
                        .description(exception.getMessage())
                , HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
