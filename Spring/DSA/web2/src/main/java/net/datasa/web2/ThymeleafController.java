package net.datasa.web2;


import lombok.extern.slf4j.Slf4j;
import net.datasa.web2.domain.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
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
    @GetMapping("thymeleaf2")
    public String thymeleaf2(Model model){
        // 문자열 숫자, 리스트  맵등 출력
        String str = "문자열";
        int num =1;
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");


        model.addAttribute("str", str);
        model.addAttribute("num", num);
        model.addAttribute("list", list);


        ArrayList<Person> PersonList = new ArrayList<>();
        PersonList.add(new Person("user01", "pass01", "홍길동", "010-1234-5678", "삼성"));
        PersonList.add(new Person("user02", "pass02", "이순신", "010-2345-6789", "LG"));
        PersonList.add(new Person("user03", "pass03", "강감찬", "010-3456-7890", "네이버"));
        PersonList.add(new Person("user04", "pass04", "신사임당", "010-4567-8901", "카카오"));
        PersonList.add(new Person("user05", "pass05", "장영실", "010-5678-9012", "현대"));

// 모델에 추가
        model.addAttribute("personList", PersonList);

        return "th/thymeleaf2";
    }


}
