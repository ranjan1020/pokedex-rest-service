package com.ranjan.homechallenge.pokedex.exception;


import com.ranjan.homechallenge.pokedex.models.PokedexExceptionResponse;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.sql.Timestamp;


@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * Catches HttpClientErrorException and sends a response of
     * NOT_FOUND to caller of this API
     *
     * @param ex
     * @param request
     * @return ResponseEntity
     */
    @ExceptionHandler(value = {HttpClientErrorException.class})
    public ResponseEntity<Object> handleAnyException(HttpClientErrorException ex, WebRequest request) {
        PokedexExceptionResponse pokedexExceptionResponse = new PokedexExceptionResponse();
        pokedexExceptionResponse.setHttpStatus(ex.getStatusCode());
        pokedexExceptionResponse.setTimeStamp(new Timestamp(System.currentTimeMillis()));
        pokedexExceptionResponse.setMessage(ex.getLocalizedMessage());
       return new ResponseEntity<>(pokedexExceptionResponse, new HttpHeaders(), ex.getStatusCode());
    }

    /**
     * Catches RuntimeException and sends message from runtime exception
     * in resposne to API call
     * @param ex
     * @param request
     * @return ResponseEntity
     */

    @ExceptionHandler(value = {RuntimeException.class})
    public ResponseEntity<Object> handleAnyException(RuntimeException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), new HttpHeaders(), HttpStatus.BAD_REQUEST);
    }

}
