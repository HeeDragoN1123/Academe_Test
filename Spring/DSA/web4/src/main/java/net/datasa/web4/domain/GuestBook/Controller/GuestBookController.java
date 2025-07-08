package net.datasa.web4.domain.GuestBook.Controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.web4.domain.GuestBook.Dto.GuestBookDTO;
import net.datasa.web4.domain.GuestBook.Service.GuestBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/guestbook")
public class GuestBookController {

    private final GuestBookService guestBookService;

    // 1. 글쓰기 폼 보여주기 (GET)
    @GetMapping("/write")
    public String writeForm(Model model) {
        model.addAttribute("guestbook", new GuestBookDTO());
        return "write"; // → templates/write.html
    }

    @PostMapping("/write")
    public String write(@ModelAttribute GuestBookDTO dto) {
        log.debug("작성한 글: {}", dto);
        guestBookService.write(dto);
        return "redirect:/";
    }
}
