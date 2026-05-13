package com.study.stage03.controller;

import com.study.stage03.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorResponse> handleValidationException(MethodArgumentNotValidException exception) {
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

        List<String> errors = new ArrayList<>();

        for (FieldError fieldError : fieldErrors) {
            errors.add(fieldError.getField() + ": " + fieldError.getDefaultMessage());
        }

        ErrorResponse errorResponse = new ErrorResponse(
                "요청 값이 올바르지 않습니다.",
                errors
        );

        return ResponseEntity.badRequest().body(errorResponse);
    }
}
