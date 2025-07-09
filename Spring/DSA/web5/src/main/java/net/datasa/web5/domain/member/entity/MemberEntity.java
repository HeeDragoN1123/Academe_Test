package net.datasa.web5.domain.member.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "web5_member") // ← 여기!
public class MemberEntity {

    @Id
    @Column(name = "member_id", length = 30)
    private String memberId;

    @Column(name = "member_password", length = 100, nullable = false)
    private String memberPassword;

    @Column(name = "member_name", length = 30, nullable = false)
    private String memberName;

    @Column(length = 50)
    private String email;

    @Column(length = 30)
    private String phone;

    @Column(length = 200)
    private String address;

    @Column(name = "enabled")
    private Boolean enabled = true; // 1 = 사용가능, 0 = 사용불가

    @Column(length = 30, columnDefinition = "VARCHAR(30) DEFAULT 'ROLE_USER'")
    private String rolename = "ROLE_USER"; // ROLE_USER, ROLE_ADMIN

    // JPA에서는 CHECK 제약조건은 직접적으로 지원하지 않습니다.
    // 비즈니스 로직으로 체크해야 합니다.
}
