package net.datasa.web4;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.datasa.web4.domain.GuestBook.Entity.GuestBookEntity;
import net.datasa.web4.domain.GuestBook.Repository.GuestBookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    private final GuestBookRepository guestBookRepository;

    @GetMapping("")
    public String home(Model model) {
        List<GuestBookEntity> entries = guestBookRepository.findAll();
        model.addAttribute("entries", entries);
        return "index"; // → templates/home.html
    }
}
