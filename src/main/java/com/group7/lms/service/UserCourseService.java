package com.group7.lms.service;

import com.group7.lms.dto.UserCourseDTO;
import com.group7.lms.entity.UserCourse;
import com.group7.lms.exception.ItemNotFoundException;
import com.group7.lms.repo.UserCourseRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserCourseService {
    @Autowired
    private UserCourseRepo userCourseRepo;
    @Autowired
    private ModelMapper modelMapper;
    public ResponseEntity<UserCourseDTO> saveUserCourse(UserCourseDTO userCourseDTO){
        userCourseRepo.save(modelMapper.map(userCourseDTO, UserCourse.class));
        return ResponseEntity.ok(userCourseDTO);
    }
    public ResponseEntity<UserCourseDTO> updateUserCourse(UserCourseDTO userCourseDTO){
        userCourseRepo.save(modelMapper.map(userCourseDTO, UserCourse.class));
        return ResponseEntity.ok(userCourseDTO);
    }
    public ResponseEntity<List<UserCourseDTO>> selectAllUserCourses(){
        List<UserCourse> userList=userCourseRepo.findAll();
        return ResponseEntity.ok(modelMapper.map(userList,new TypeToken<List<UserCourseDTO>>(){}.getType()));
    }
    public ResponseEntity<UserCourseDTO> selectUserCourseById(String id,String coursed) throws ItemNotFoundException {
        UserCourse user=userCourseRepo.getUserCourseById(id,coursed);
        if(user !=null){
            UserCourseDTO userDTO=modelMapper.map(user,UserCourseDTO.class);
            return ResponseEntity.ok(userDTO);
        }
        else{
            throw new ItemNotFoundException("UserCourse do not exist with id :"+id +"and"+coursed);
        }
    }
    public boolean deleteUser(UserCourseDTO userDTO){
        userCourseRepo.delete(modelMapper.map(userDTO,UserCourse.class));
        return true;
    }

}

