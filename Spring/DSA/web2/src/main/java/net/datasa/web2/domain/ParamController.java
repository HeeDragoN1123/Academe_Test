package net.datasa.web2.domain;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ParamController {
    @GetMapping("/param/view1")
    public String view1(){
        return "/paramView/view1";
    }
}
