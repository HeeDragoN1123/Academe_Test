package net.datasa.web5.domain.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.web5.domain.member.dto.MemberDTO;
import net.datasa.web5.domain.member.service.MemberService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@Controller
public class MemberController {

    private final MemberService memberService;

    // 회원가입 폼 GET
    @GetMapping("/signup")
    public String showSignupForm() {
        log.info("회원가입 창 이동");
        return "signup";
    }

    // 회원가입 POST
    @PostMapping("/signup")
    public String processSignup(@ModelAttribute MemberDTO memberDTO) {
        log.info("회원가입 요청: {}", memberDTO);
        memberService.signup(memberDTO);
        return "home";
    }
}
