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

    @GetMapping(PathContstants.MEMBER_IDCHECK)  // "/member/idcheck"로 변경
    @ResponseBody
    public boolean checkMemberDuplicate(@RequestParam String memberId) {
        return memberService.isMemberIdDuplicate(memberId);
    }

    @PostMapping(PathContstants.MEMBER_JOIN)  // POST는 "/member/join"으로
    public String processSignup(@ModelAttribute MemberDTO memberDTO) {
        memberService.signup(memberDTO);
        return "redirect:/";
    }

    @GetMapping(PathContstants.MEMBER_LOGIN)
    public String showLoginForm() {
        return "signup"; // templates/login.html
    }

    @PostMapping(PathContstants.MEMBER_LOGIN)
    public String processLogin(@RequestParam String memberId,
                               @RequestParam String memberPassword) {
        log.info("로그인 시도: {}", memberId);
        boolean result = memberService.login(memberId, memberPassword);

        if (result) {
            log.info("로그인 성공");
            // TODO: 세션처리, 홈 이동 등
            return "redirect:/";
        } else {
            log.info("로그인 실패");
            // TODO: 에러메시지, 로그인 페이지 재진입 등
            return "redirect:/login";
        }

    }

    @GetMapping(PathContstants.MEMBER_INFO)
    public String proflieInfo() {
        return "info"; // templates/login.html
    }

//    새로가입
//    dbㄴ에서 강비한 데이터 직접 확인 비밀번호 암호화 확인
}
