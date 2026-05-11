package edu.icet.ecom.dto;

import edu.icet.ecom.util.Gender;
import edu.icet.ecom.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class TrainerDto {

    private Long id;

    private String firstName;

    private String lastName;

    private Gender gender;

    private LocalDate dateOfBirth;

    private String email;

    private String phoneNumber;

    private String address;

    private String specialization;

    private Integer experienceYears;

    private Double salary;

    private LocalDate hireDate;

    private Status status;
}
