package com.group7.lms.controller;

import com.group7.lms.dto.CourseDTO;
import com.group7.lms.exception.ItemNotFoundException;
import com.group7.lms.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "api/v2/course")
@CrossOrigin
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/getAllCourses")
    public ResponseEntity<List<CourseDTO>> getAllCourses(){
        return courseService.selectAllCourses();
    }
    @GetMapping("/getCourseById/{Id}")
    public ResponseEntity<CourseDTO> getCourseById(@PathVariable String Id) throws ItemNotFoundException {
        return courseService.selectCourseById(Id);
    }
    @PostMapping("/saveCourse")
    public ResponseEntity<CourseDTO> saveCourse(@RequestBody @Valid CourseDTO courseDTO){
        return courseService.saveCourse(courseDTO);
    }
    @PutMapping("/updateCourse")
    public ResponseEntity<CourseDTO> updateCourse(@RequestBody @Valid CourseDTO courseDTO){
        return courseService.updateCourse(courseDTO);
    }
    @DeleteMapping("/deleteCourse")
    public boolean deleteCourse(@RequestBody CourseDTO userDTO) {
        return courseService.deleteCourse(userDTO);
    }
}

