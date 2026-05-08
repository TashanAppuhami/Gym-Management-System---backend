package edu.icet.ecom.dto.request;

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

    private String first_name;
    private String last_name;

    private String email;
    private String phone_number;

    private Gender gender;

    private LocalDate dateOfBirth;

    private LocalDate joinDate;

    private String address;

    private Status status;
}
