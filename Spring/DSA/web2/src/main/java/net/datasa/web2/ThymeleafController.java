package net.datasa.web2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("th")
@Controller
@Slf4j
public class ThymeleafController {

    @GetMapping("thymeleaf1")
    public String thymeleaf1(Model model){

        int a= 1;
        String b= "홍길동";

        model.addAttribute("num",a);
        model.addAttribute("str",b);



        return "th/thymeleaf1";
    }
}
