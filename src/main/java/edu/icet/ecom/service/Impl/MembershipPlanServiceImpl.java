package edu.icet.ecom.service.Impl;

import edu.icet.ecom.dto.MembershipPlanDto;
import edu.icet.ecom.entity.MembershipPlan;
import edu.icet.ecom.repositary.MembershipPlanRepositary;
import edu.icet.ecom.service.MembershipPlanService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MembershipPlanServiceImpl implements MembershipPlanService {

    private final MembershipPlanRepositary membershipPlanRepositary;
    private final ModelMapper modelMapper;

    @Override
    public MembershipPlanDto createPlan(MembershipPlanDto membershipPlanDto) {

        MembershipPlan  membershipPlan = modelMapper.map(membershipPlanDto, MembershipPlan.class);

        membershipPlanRepositary.save(membershipPlan);

        return modelMapper.map(membershipPlan, MembershipPlanDto.class);
    }

    @Override
    public MembershipPlanDto getPlanById(Long id) {
        MembershipPlan plan = membershipPlanRepositary.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Membership Plan not found with id: " + id));

        return modelMapper.map(plan, MembershipPlanDto.class);
    }

    @Override
    public List<MembershipPlanDto> getAllPlans() {
        return List.of((MembershipPlanDto) membershipPlanRepositary.findAll());
    }

    @Override
    public MembershipPlanDto updatePlan(Long id, MembershipPlanDto membershipPlanDto) {
        MembershipPlan existingPlan = membershipPlanRepositary.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Membership Plan not found with id: " + id));

        modelMapper.map(membershipPlanDto, existingPlan);

        MembershipPlan updatedPlan = membershipPlanRepositary.save(existingPlan);

        return modelMapper.map(updatedPlan, MembershipPlanDto.class);
    }

    @Override
    public void deletePlan(Long id) {
        membershipPlanRepositary.deleteById(id);
    }
}
