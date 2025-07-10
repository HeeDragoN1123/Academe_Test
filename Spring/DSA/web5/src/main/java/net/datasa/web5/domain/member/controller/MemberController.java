package net.datasa.web5.domain.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.web5.PathContstants;
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
    @GetMapping(PathContstants.MEMBER_SIGNUP)
    public String showSignupForm() {
        log.info("회원가입 창 이동");
        return "signup";
    }

    // 회원가입 POST
    @PostMapping(PathContstants.MEMBER_SIGNUP)
    public String processSignup(@ModelAttribute MemberDTO memberDTO) {
        log.info("회원가입 요청: {}", memberDTO);
        memberService.signup(memberDTO);
        return "home";
    }

    // **회원 중복확인** (AJAX 등에서 사용)
    @GetMapping(PathContstants.MEMBER_JOIN)
    @ResponseBody
    public boolean checkMemberDuplicate(@RequestParam String memberId) {
        log.info("회원 중복 확인 요청: {}", memberId);
        boolean isDuplicate = memberService.isMemberIdDuplicate(memberId);
        return isDuplicate;
    }


}
