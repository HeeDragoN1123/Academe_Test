package net.datasa.web3.domain.User.Controller;

import net.datasa.web3.domain.Person.Dto.PersonDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import lombok.extern.slf4j.Slf4j;

public class UserController {
    public String insert(){

        return "insert";
    }


    @PostMapping("insert")
    public String insert(@ModelAttribute PersonDTO dto) {
        log.debug("전달 값:{}". dto);
        // 여기서 dto를 사용하여 필요한 작업을 수행합니다.
        // 예: 데이터베이스에 저장, 서비스 호출 등

        // 성공 후 리다이렉트 또는 다른 페이지로 이동
        // 예: "redirect:/success" 또는 "redirect:/home"


        return "redirect:/";
    }

}