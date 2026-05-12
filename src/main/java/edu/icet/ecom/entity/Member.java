package edu.icet.ecom.entity;

import edu.icet.ecom.util.Gender;
import edu.icet.ecom.util.Status;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "members")
@Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate dateOfBirth;

    private LocalDate joinDate;

    private String address;

    @ManyToOne
    @JoinColumn(name = "membership_plans")
    private MembershipPlan membershipPlan;

    @Enumerated(EnumType.STRING)
    private Status status;
}
