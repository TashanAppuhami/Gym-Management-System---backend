package edu.icet.ecom.dto.request;

import java.time.LocalDate;

public class MembertDto {

    private Long id;

    private String firstName;
    private String lastName;

    private String email;
    private String phoneNumber;

    private String gender;

    private LocalDate dateOfBirth;

    private LocalDate joinDate;

    private String address;

    private boolean active;
}
