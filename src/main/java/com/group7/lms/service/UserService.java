package com.group7.lms.service;

import com.group7.lms.dto.CourseDTO;
import com.group7.lms.dto.UserDTO;
import com.group7.lms.entity.Course;
import com.group7.lms.entity.User;
import com.group7.lms.exception.ItemNotFoundException;
import com.group7.lms.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<UserDTO> saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return ResponseEntity.ok(userDTO);
    }
    public ResponseEntity<UserDTO> updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));
        return ResponseEntity.ok(userDTO);
    }
    public ResponseEntity<List<UserDTO>> selectAllUsers(){
        List<User> userList=userRepo.findAll();
        return ResponseEntity.ok(modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType()));
    }
    public ResponseEntity<UserDTO> selectUserById(String id) throws ItemNotFoundException {
        User user=userRepo.getUserById(id);
        if(user !=null){
            UserDTO userDTO=modelMapper.map(user,UserDTO.class);
            return ResponseEntity.ok(userDTO);
        }
        else{
            throw new ItemNotFoundException("User do not exist with id :"+id);
        }
    }
    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }

}
