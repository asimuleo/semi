package kr.imhyuk.itcen.semi.member.controller;

import kr.imhyuk.itcen.semi.member.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/join")
    public String join() {
        return "views/member/join";
    }

    @GetMapping("/login")
    public String login() {
        return "views/member/login";
    }

    @GetMapping("/myinfo")
    public String myinfo(Model model) {

        Member user = new Member(0,"abc123","abc123","abc123",
                "abc123@abc123.co.kr", LocalDateTime.now());

        model.addAttribute("loginUser", user);

        return "views/member/myinfo";
    }

}
