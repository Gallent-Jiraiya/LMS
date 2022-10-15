package com.group7.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor(staticName = "build")
@Data
public class CourseDTO {
    private String courseCode;
    @NotNull(message="Course needs to have course Name")
    private String courseName;
    @NotNull(message="Course needs to have course Description")
    private String courseDescription;

}
