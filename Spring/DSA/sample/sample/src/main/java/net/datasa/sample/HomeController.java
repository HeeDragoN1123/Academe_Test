package net.datasa.sample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	// http://localhost:9999 경로로 요청이 들어왔을 때 실행될 메소드
	@GetMapping("")
	public String main() {
		
		//templates 경로의 home.html
		return "home";
	}

	// http://localhost:9999/test 경로로 요청이 들어왔을 때 실행될 메소드
	@GetMapping("test")
	public String subpage(Model model) {
		//모델에 key-value 형식으로 객체 저장
        model.addAttribute("message", "테스트 페이지입니다.");

		//templates 경로의 test.html
        return "test";
	}
	
}
