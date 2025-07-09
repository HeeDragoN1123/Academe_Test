package net.datasa.web5.domain.member.service;

import lombok.RequiredArgsConstructor;
import net.datasa.web5.domain.member.dto.MemberDTO;
import net.datasa.web5.domain.member.entity.MemberEntity;
import net.datasa.web5.domain.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void signup(MemberDTO dto) {
        // 1. DTO → Entity 변환 (Builder 이용)
        MemberEntity member = MemberEntity.builder()
                .memberId(dto.getMemberId())
                .memberPassword(dto.getMemberPassword()) // 보통 암호화 필요!
                .memberName(dto.getMemberName())
                .email(dto.getEmail())
                .phone(dto.getPhone())
                .address(dto.getAddress())
                .enabled(true)           // ← 명시적으로 값 할당!
                .rolename("ROLE_USER")// ← 명시적으로 값 할당!
                .build();
        // 2. 저장
        memberRepository.save(member);
    }
}
