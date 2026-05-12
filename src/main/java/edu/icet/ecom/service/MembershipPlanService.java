package edu.icet.ecom.service;

import edu.icet.ecom.dto.MembershipPlanDto;

import java.util.List;

public interface MembershipPlanService {

    MembershipPlanDto createPlan(MembershipPlanDto membershipPlanDto);

    MembershipPlanDto getPlanById(Long id);

    List<MembershipPlanDto> getAllPlans();

    MembershipPlanDto updatePlan(Long id, MembershipPlanDto membershipPlanDto);

    void deletePlan(Long id);
}
