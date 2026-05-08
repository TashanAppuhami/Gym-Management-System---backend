package edu.icet.ecom.service;

import edu.icet.ecom.dto.request.MemberDto;

public interface MemberService {
    public  MemberDto rejisterMember(MemberDto memberdto);
    public  MemberDto getMemberById(Long id);
    public  MemberDto updateMember(MemberDto memberdto);
    public  boolean deleteMember(Long id);
}
