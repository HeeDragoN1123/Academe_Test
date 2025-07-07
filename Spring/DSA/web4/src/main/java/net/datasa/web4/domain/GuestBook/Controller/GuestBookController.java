package net.datasa.web4.domain.GuestBook.Controller;

import lombok.Data;
import net.datasa.web4.domain.GuestBook.Entity.GuestBookEntity;
import net.datasa.web4.domain.GuestBook.Repository.GuestBookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Data
@Controller
@RequestMapping("/guestbook")
public class GuestBookController {

    private final GuestBookRepository guestBookRepository;

    public GuestBookController(GuestBookRepository guestBookRepository) {
        this.guestBookRepository = guestBookRepository;
    }

    @GetMapping("/write")
    public String writeForm(Model model) {
        model.addAttribute("guestbook", new GuestBookEntity());
        return "write"; // 위 HTML 파일 이름
    }

    @PostMapping("/save")
    public String save(@ModelAttribute GuestBookEntity guestbook) {
        guestBookRepository.save(guestbook);
        return "redirect:/"; // 저장 후 목록 페이지로 이동
    }
}
