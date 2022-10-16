package com.group7.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCourseDTO {
    private String userID;
    private String courseCode;
    private String marks;
    private String enrollDate;

}
