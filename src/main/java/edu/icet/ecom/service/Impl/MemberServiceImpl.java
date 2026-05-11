package edu.icet.ecom.service.Impl;

import edu.icet.ecom.dto.MemberDto;
import edu.icet.ecom.entity.Member;
import edu.icet.ecom.repositary.MemberRepositary;
import edu.icet.ecom.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepositary memberRepositary;
    private final ModelMapper modelMapper;

    @Override
    public MemberDto rejisterMember(MemberDto memberDto) {

        Member member = modelMapper.map(memberDto, Member.class);

        memberRepositary.save(member);

        return modelMapper.map(member, MemberDto.class);
    }

    @Override
    public MemberDto getMemberById(Long id) {

        Member member = memberRepositary.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Member not found"));

        return modelMapper.map(member, MemberDto.class);
    }

    @Override
    public MemberDto updateMember(MemberDto memberdto) {

        Member existingMember = memberRepositary.findById(memberdto.getId())
                .orElseThrow(() ->
                        new RuntimeException("Member not found"));

        modelMapper.map(memberdto, existingMember);

        Member savedMember = memberRepositary.save(existingMember);

        return modelMapper.map(savedMember, MemberDto.class);
    }

    @Override
    public boolean deleteMember(Long id) {
        memberRepositary.deleteById(id);
        return true;
    }
}
