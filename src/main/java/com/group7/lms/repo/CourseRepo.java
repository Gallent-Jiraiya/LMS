package com.group7.lms.repo;

import com.group7.lms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CourseRepo extends JpaRepository<Course,String> {
    @Query(value = "SELECT * from course where course_code=?1",nativeQuery = true)
    Course getCourseById(String id);

}
