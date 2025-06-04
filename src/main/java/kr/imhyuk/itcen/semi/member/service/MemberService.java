package kr.imhyuk.itcen.semi.member.service;

import kr.imhyuk.itcen.semi.member.domain.Member;
import kr.imhyuk.itcen.semi.member.domain.dto.MemberDTO;

public interface MemberService {

    boolean newMember(MemberDTO member);
    Member loginMember(MemberDTO member);

}
