package net.datasa.web5.domain.member.service;

import lombok.RequiredArgsConstructor;
import net.datasa.web5.domain.member.dto.MemberDTO;
import net.datasa.web5.domain.member.entity.MemberEntity;
import net.datasa.web5.domain.member.repository.MemberRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;
    private final PasswordEncoder passwordEncoder;


    // 회원가입
    public void signup(MemberDTO dto) {
        // 1. DTO → Entity 변환 (Builder 이용)
        MemberEntity member = MemberEntity.builder()
                .memberId(dto.getMemberId())
                .memberPassword(passwordEncoder.encode(dto.getMemberPassword()))
                .memberName(dto.getMemberName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .address(dto.getAddress())
                .enabled(true)
                .rolename("ROLE_USER")
                .build();
        // 2. 저장
        memberRepository.save(member);
    }

    // ID 중복 확인 (AJAX/중복검사 전용)
    public boolean isMemberIdDuplicate(String memberId) {
        // true = 이미 있음(중복), false = 사용 가능
        return memberRepository.existsById(memberId);
    }

    public boolean login(String memberId, String memberPassword) {
        return memberRepository.findByMemberId(memberId)
                .map(member -> member.getMemberPassword().equals(memberPassword))
                .orElse(false);
    }



}
