package com.ratp.sauvetonnavigo.Config;

import com.ratp.sauvetonnavigo.Config.Exception.EmailNotFondException;
import com.ratp.sauvetonnavigo.Config.Exception.EmailUnicityException;
import com.ratp.sauvetonnavigo.Config.Exception.MdpFauxException;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
@RestControllerAdvice
public class WebConfig  {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleBadRequest(Exception ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmailUnicityException.class)
    public ResponseEntity<Object> handleEmailNotUnique(EmailUnicityException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MdpFauxException.class)
    public ResponseEntity<Object> handleMdpFaux(MdpFauxException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(EmailNotFondException.class)
    public ResponseEntity<Object> handleEmailNotFond(EmailNotFondException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }


}

