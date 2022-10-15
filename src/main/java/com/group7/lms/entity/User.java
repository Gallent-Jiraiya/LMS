package com.group7.lms.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    @Column(length = 20)
    private String userID;
    @Column(nullable = false,length = 50)
    private String firstName;
    @Column(length = 50,nullable = false)
    private String lastName;
    @Column(length = 50,nullable = true)
    private String eMail;
    @Column(length = 25)
    private String country;
    @Column(length = 25)
    private String city;
    @Column(length = 25)
    private String district;
    @Column(length = 50)
    private String street;
    @Column(length = 10)
    private int postalCode;
    private String role;
    private String password;

}
