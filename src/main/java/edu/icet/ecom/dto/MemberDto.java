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
public class MemberDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private Integer age;

    private Gender gender;

    private LocalDate dateOfBirth;

    private LocalDate joinDate;

    private String address;

    private MembershipPlanDto membershipPlan;

    private Status status;
}
