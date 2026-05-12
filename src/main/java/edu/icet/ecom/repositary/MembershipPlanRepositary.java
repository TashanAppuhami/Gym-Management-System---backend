package edu.icet.ecom.repositary;

import edu.icet.ecom.entity.MembershipPlan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MembershipPlanRepositary extends JpaRepository<MembershipPlan, Long> {
    List<MembershipPlan> id(Long id);
}
