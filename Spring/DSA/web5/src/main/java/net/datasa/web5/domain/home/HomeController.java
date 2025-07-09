package net.datasa.web5.domain.home;


import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Slf4j
@Controller
public class HomeController {

    @GetMapping("")
    public String home(Model model) {
        return "home"; // → templates/home.html
    }


}
