package edu.icet.ecom.entity;

import edu.icet.ecom.util.Gender;
import edu.icet.ecom.util.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "trainers")
@Data
public class Trainer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate dateOfBirth;

    private String email;

    private String phoneNumber;

    private String address;

    private String specialization;

    private Integer experienceYears;

    private Double salary;

    private LocalDate hireDate;

    @Enumerated(EnumType.STRING)
    private Status status;
}