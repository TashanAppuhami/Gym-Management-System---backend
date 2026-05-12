package edu.icet.ecom.controller;

import edu.icet.ecom.dto.MembershipPlanDto;
import edu.icet.ecom.service.MembershipPlanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/api/plans")
@RequiredArgsConstructor
public class MembershipPlanController {

    private final MembershipPlanService membershipPlanService;

    @PostMapping("/create-plan")
    public ResponseEntity<MembershipPlanDto> createPlan(
            @RequestBody MembershipPlanDto membershipPlanDto) {

        return ResponseEntity.ok(
                membershipPlanService.createPlan(membershipPlanDto)
        );
    }

    @GetMapping("/get-plan-by-id/{id}")
    public ResponseEntity<MembershipPlanDto> getPlanById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                membershipPlanService.getPlanById(id)
        );
    }

    @GetMapping("/get-all-plans")
    public ResponseEntity<List<MembershipPlanDto>> getAllPlans() {

        return ResponseEntity.ok(
                membershipPlanService.getAllPlans()
        );
    }

    @PutMapping("/update-plan/{id}")
    public ResponseEntity<MembershipPlanDto> updatePlan(@PathVariable Long id, @RequestBody MembershipPlanDto membershipPlanDto) {

        return ResponseEntity.ok(
                membershipPlanService.updatePlan(id, membershipPlanDto)
        );
    }

    @DeleteMapping("/delete-plan/{id}")
    public ResponseEntity<String> deletePlan(@PathVariable Long id) {

        membershipPlanService.deletePlan(id);
        return ResponseEntity.ok("Plan deleted successfully");
    }
}
