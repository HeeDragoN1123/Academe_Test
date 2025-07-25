package net.datasa.web5.domain.member.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberDTO {
    private String memberId;
    private String memberPassword;
    private String memberName;
    private String email;
    private String phone;
    private String address;
    private Boolean enabled;
    private String rolename;
}
