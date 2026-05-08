package edu.icet.ecom.repositary;

import edu.icet.ecom.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepositary extends JpaRepository<Member, Long> {

}
