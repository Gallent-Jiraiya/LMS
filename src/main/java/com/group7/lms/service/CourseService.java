package com.group7.lms.service;

import com.group7.lms.dto.CourseDTO;
import com.group7.lms.entity.Course;
import com.group7.lms.exception.CourseNotFoundException;
import com.group7.lms.repo.CourseRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;
    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<CourseDTO> saveCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, Course.class));
        return ResponseEntity.ok(courseDTO);
    }
    public ResponseEntity<CourseDTO> updateCourse(CourseDTO courseDTO){
        courseRepo.save(modelMapper.map(courseDTO, Course.class));
        return ResponseEntity.ok(courseDTO);
    }
    public ResponseEntity<List <CourseDTO>> selectAllCourses(){
        List<Course> courseList=courseRepo.findAll();
        return ResponseEntity.ok(modelMapper.map(courseList,new TypeToken<List<CourseDTO>>(){}.getType()));
    }
    public ResponseEntity<CourseDTO> selectCourseById(String id) throws CourseNotFoundException {
        Course course=courseRepo.getCourseById(id);
        if(course !=null){
            CourseDTO courseDTO=modelMapper.map(course,CourseDTO.class);
            return ResponseEntity.ok(courseDTO);
        }
        else{
            throw new CourseNotFoundException("Course do not exist with id :"+id);
        }

    }
    public boolean deleteUser(CourseDTO userDTO){
        courseRepo.delete(modelMapper.map(userDTO,Course.class));
        return true;
    }


}
