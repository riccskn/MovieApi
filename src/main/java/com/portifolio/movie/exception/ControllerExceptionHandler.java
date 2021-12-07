package com.portifolio.movie.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
     public ResponseEntity<ErrorMessage> entityNotFoundException(EntityNotFoundException exception, WebRequest request) {

       ErrorMessage errorMessage = new ErrorMessage(
               HttpStatus.NOT_FOUND.value(),
               new Date(),
               exception.getMessage(),
               request.getDescription(false)

       );

       return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.NOT_FOUND);


    }

    @ExceptionHandler(EntityAlreadyExists.class)
     public ResponseEntity<ErrorMessage> entityAlreadyExistsException(EntityAlreadyExists exception, WebRequest request) {

        ErrorMessage errorMessage = new ErrorMessage(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                exception.getMessage(),
                request.getDescription(false)

        );

        return new ResponseEntity<ErrorMessage>(errorMessage, HttpStatus.OK);


    }

}
