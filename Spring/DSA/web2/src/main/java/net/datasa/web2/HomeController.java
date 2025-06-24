package net.datasa.web2;

import lombok.extern.slf4j.Slf4j;
import net.datasa.web2.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class HomeController {
//    @GetMapping("")
//    public String main() {
//        return "home";
//    }

    // inner 경로
    @GetMapping("/inner")
    public String inner() {
        return "inner"; // resources/templates/inner.html을 렌더링
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name,Model model){
        model.addAttribute("name" , name);
        return "hello";
    }

    @GetMapping("lombok")
        public String lombok(){
        Person a = new Person();
        a.setId("abc");
        a.setPassword("123");
        a.setPassword("이름");
        a.setPassword("폰");
        a.setPassword("컴");
        System.out.println(a.getId());



        return "redirect:/";
    }



    @GetMapping("Logger")
    public String Logger(){
//        System.out.println("왓다감"); 찾기 힘들어서 사용 웬만하면 지양
        log.error("에러 출력");
        log.warn("위험 출력");
        log.info("인포출력");
        log.debug("디버그");
        log.trace("트레이스");
        return "redirect:/";
    }



}

