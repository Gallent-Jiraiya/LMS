package com.group7.lms.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class HandleExceptions {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(CourseNotFoundException.class)
    public Map<String,String> handleCourseNotFoundException(CourseNotFoundException ex){
        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("ErrorMessage",ex.getMessage());
        return errorMap;
    }

}
