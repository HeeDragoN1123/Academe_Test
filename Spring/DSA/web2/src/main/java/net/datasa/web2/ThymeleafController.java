package net.datasa.web2;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RequestMapping("th")
@Controller
@Slf4j
public class ThymeleafController {

    @GetMapping("thymeleaf1")
    public String thymeleaf1(Model model){

        int a= 0;
        String b= "홍길동";

        model.addAttribute("num",a);
        model.addAttribute("str",b);

        int n1 = 10000;
        double n2 = 12.222;
        double n3 = 2.8;
        Date date = new Date();
        LocalDate localDate =  LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        String value = "010-7777-8888";



        model.addAttribute("n1", n1);
        model.addAttribute("n2", n2);
        model.addAttribute("n3", n3);
        model.addAttribute("date", date);
        model.addAttribute("localDate", localDate);
        model.addAttribute("localDateTime", localDateTime);
        model.addAttribute("value", value);


        return "th/thymeleaf1";
    }
}
