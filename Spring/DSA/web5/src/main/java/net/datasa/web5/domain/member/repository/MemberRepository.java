package net.datasa.web5.domain.member.repository;

import net.datasa.web5.domain.member.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, String> {
    // 추가 쿼리 필요하면 여기에!

    Optional<MemberEntity> findByMemberId(String memberId);

}
