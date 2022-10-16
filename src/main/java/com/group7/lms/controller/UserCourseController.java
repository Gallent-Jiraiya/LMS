package com.group7.lms.controller;

import com.group7.lms.dto.UserCourseDTO;
import com.group7.lms.exception.ItemNotFoundException;
import com.group7.lms.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "api/v2/userCourse")
@CrossOrigin
public class UserCourseController {

    @Autowired
    private UserCourseService userCourseService;

    @GetMapping("/getUserCourseById/{id}/{courseCode}")
    public ResponseEntity<UserCourseDTO> getUserCourseById(@PathVariable String id, @PathVariable String courseCode) throws ItemNotFoundException {
        return userCourseService.selectUserCourseById(id,courseCode);
    }
    @GetMapping("/getAllUserCourses")
    public ResponseEntity<List<UserCourseDTO>> getAllUserCourses(){
        return userCourseService.selectAllUserCourses();
    }
    @PostMapping("/saveUserCourse")
    public ResponseEntity<UserCourseDTO> saveUser(@RequestBody @Valid UserCourseDTO userDTO){
        return userCourseService.saveUserCourse(userDTO);
    }
    @PutMapping("/updateUserCourse")
    public ResponseEntity<UserCourseDTO> updateUser(@RequestBody UserCourseDTO userDTO){
        return userCourseService.updateUserCourse(userDTO);
    }
    @DeleteMapping("/deleteUserCourse")
    public boolean deleteUser(@RequestBody UserCourseDTO userDTO){
        return userCourseService.deleteUser(userDTO);
    }
}
