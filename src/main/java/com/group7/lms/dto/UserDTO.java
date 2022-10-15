package com.group7.lms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    @NotNull(message="User needs to have User ID")
    private String userID;
    @NotNull(message="User needs to have First name")
    private String firstName;
    @NotNull(message="User needs to have Last name")
    private String lastName;
    @Email
    private String eMail;
    private String country;
    private String city;
    private String district;
    private String street;
    private int postalCode;
    @NotNull(message="User needs to have role")
    private String role;
    @NotNull(message="User needs to have Password")
    private String password;

}
