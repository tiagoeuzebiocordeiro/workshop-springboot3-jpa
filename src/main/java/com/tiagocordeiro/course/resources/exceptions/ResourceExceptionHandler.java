package com.tiagocordeiro.course.resources.exceptions;

import com.tiagocordeiro.course.services.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        String error = "Resource not found";
        int status = HttpStatus.NOT_FOUND.value();
        StandardError err = new StandardError(Instant.now(), status, error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }

}
