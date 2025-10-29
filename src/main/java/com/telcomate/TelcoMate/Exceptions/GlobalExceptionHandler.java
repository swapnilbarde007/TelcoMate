package com.telcomate.TelcoMate.Exceptions;

import com.telcomate.TelcoMate.Model.dto.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<Object> handleProductNotFoundException(ProductNotFoundException ex){
        //String path=request.getDescription(false);
        LocalDateTime now= LocalDateTime.now();

        return new ResponseEntity<>(new ResponseDTO("HELLO",HttpStatus.NOT_FOUND,ex.getMessage(),now),HttpStatus.NOT_FOUND);
    }
}
