package net.datasa.web4.domain.GuestBook.Dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class GuestBookDTO {
    private Integer id;
    private String name;
    private String password;
    private String message;
    private LocalDateTime createdAt; // ★ 추가
}
