package edu.icet.ecom.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class Member {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @NotBlank
    @Email
    private String email;
    private String phoneNumber;

    private String gender;

    private LocalDate dateOfBirth;

    private LocalDate joinDate;

    private String address;

    private boolean active;
}
