package com.group7.lms.entity;

import com.group7.lms.dto.MyKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@IdClass(MyKey.class)
public class UserCourse {
    @Id
    private String userID;
    @Id
    private String courseCode;
    private String marks;
    private String enrollDate;


}
