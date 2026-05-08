package edu.icet.ecom.controller;

import edu.icet.ecom.dto.request.MemberDto;
import edu.icet.ecom.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/add-member")
    public MemberDto createMember(@RequestBody MemberDto dto){
        return memberService.rejisterMember(dto);
    }

    @PatchMapping("/update-member")
    public MemberDto updateMember(@RequestBody MemberDto dto){
        return memberService.updateMember(dto);
    }

    @DeleteMapping("/delete-member/{id}")
    public boolean deleteMember(@PathVariable Long id){
        return memberService.deleteMember(id);
    }

    @GetMapping("/get-member-by-id/{id}")
    public MemberDto getMemberById(@PathVariable Long id){
        return memberService.getMemberById(id);
    }


}
