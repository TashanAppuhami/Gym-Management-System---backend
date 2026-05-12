package edu.icet.ecom.dto;

import edu.icet.ecom.util.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MembershipPlanDto {

    private Long id;

    private String planName;

    private Integer durationInMonths;

    private Double price;

    private String description;

    private Status status;
}
