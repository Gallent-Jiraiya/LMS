package com.group7.lms.repo;



import com.group7.lms.entity.UserCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserCourseRepo extends JpaRepository<UserCourse,String> {
    @Query(value = "SELECT * from user_course where userid=?1 and course_code=?2",nativeQuery = true)
    UserCourse getUserCourseById(String userId,String courseCode);
}
