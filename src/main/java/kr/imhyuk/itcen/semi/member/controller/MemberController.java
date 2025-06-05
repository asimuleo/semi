package kr.imhyuk.itcen.semi.member.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String myinfo(Model model, HttpSession session) {
        String returnUrl = "/member/login";
//        Member user = new Member(0,"abc123","abc123","abc123",
//                "abc123@abc123.co.kr", LocalDateTime.now());
//
//        model.addAttribute("loginUser", user);
        if (session.getAttribute("loginUser") == null) {
            return "redirect:" + returnUrl;
        }
        model.addAttribute("loginUser", session.getAttribute("loginUser"));

        return "views/member/myinfo";
    }

    @GetMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

}
