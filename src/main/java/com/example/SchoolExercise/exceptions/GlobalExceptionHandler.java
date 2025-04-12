package com.example.SchoolExercise.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {
            AlreadyExistsException.class
    })
    public ResponseEntity<String> handlerAlreadyExistsException(Exception ex, HttpServletRequest Request) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }

    @ExceptionHandler(value = {
            NoStudentException.class,
            NoTeacherException.class
    })
    public ResponseEntity<String> handlerNoStudentException (Exception ex, HttpServletRequest Request) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ex.getMessage());
    }

    @ExceptionHandler(value = {
           NotValidException.class
    })
    public ResponseEntity<String> handlerNotValidException (Exception ex, HttpServletRequest Request) {
        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(ex.getMessage());
    }
}
