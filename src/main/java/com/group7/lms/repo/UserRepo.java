package com.group7.lms.repo;

import com.group7.lms.entity.Course;
import com.group7.lms.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,String> {
    @Query(value = "SELECT * from user where userid=?1",nativeQuery = true)
    User getUserById(String id);
}
