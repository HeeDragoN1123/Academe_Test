package net.datasa.web2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DAta : 게터 세터 생성자 자동완성 롬복 기능
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String id;
    private  String password;
    private  String name;
    private String phone;
    private String com;

}


