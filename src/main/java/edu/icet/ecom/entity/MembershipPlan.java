package edu.icet.ecom.entity;

import edu.icet.ecom.util.Status;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "membership_plans")
@Data
public class MembershipPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String planName;

    private Integer durationInMonths;

    private Double price;

    private String description;

    @Enumerated(EnumType.STRING)
    private Status status;
}
