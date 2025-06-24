package net.datasa.web2;


import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
    @GetMapping("cookie1")
    public String cookie(HttpServletResponse response) {
        Cookie c1 = new Cookie ("str" , "abcd");
        Cookie c2 = new Cookie("num" , "123");
// 쿠키 유지시간 설정
        c1.setMaxAge(60*60*23*3);
        c2.setMaxAge(60*60*23*3);
// 쿠키 경로 성정
        c1.setPath("/");
        c2.setPath("/");
// 응답 정보에 쿠키 보내기
        response.addCookie(c1);
        response.addCookie(c2);

        return "redirect:/"; // redirect 안 함
    }

    @GetMapping("cookie2")
    public String cookie2(HttpServletResponse response) {
        Cookie c1 = new Cookie ("str" , "null");
        Cookie c2 = new Cookie("num" , "null");
// 쿠키 유지시간 설정
        c1.setMaxAge(0);
        c2.setMaxAge(0);
// 쿠키 경로 성정
        c1.setPath("/");
        c2.setPath("/");
// 응답 정보에 쿠키 보내기
        response.addCookie(c1);
        response.addCookie(c2);

        return "redirect:/"; // redirect 안 함
    }



    @GetMapping("cookie3")
    public String cookie3(
            HttpServletResponse response,
            @CookieValue(name = "str", defaultValue = "") String s,
            @CookieValue(name = "num", defaultValue = "0") int n
    ) {

        return "redirect:/"; // redirect 안 함
    }

    @GetMapping("cookie4")
    public String cookie4(
            HttpServletResponse response,
            @CookieValue(name = "count", defaultValue = "0") int count
    ) {
        int newCount = count + 1;

        // 쿠키 생성 및 저장
        Cookie cookie = new Cookie("count", String.valueOf(newCount));
        cookie.setMaxAge(60 * 60 * 24 * 3); // 3일 유지
        cookie.setPath("/");

        response.addCookie(cookie);

        return "redirect:/"; // 홈으로 리다이렉트
    }
    @GetMapping("/")
    public String home(
            @CookieValue(name = "count", defaultValue = "0") int count,
            Model model
    ) {
        model.addAttribute("count", count);
        return "home"; // index.html이 thymeleaf 템플릿에 있어야 함
    }


}




