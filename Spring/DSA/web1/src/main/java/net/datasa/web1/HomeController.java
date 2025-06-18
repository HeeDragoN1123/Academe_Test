package net.datasa.web1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("")
    public String main() {
        return "home";
    }

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
}

