package com.group7.lms.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Data
public class Course {
    @Id
    private String courseCode;
    private String courseName;
    private String courseDescription;

}
