package kr.imhyuk.itcen.semi.member.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class MemberDTO {

    private String userid;
    private String passwd;
    private String name;
    private String email;

}