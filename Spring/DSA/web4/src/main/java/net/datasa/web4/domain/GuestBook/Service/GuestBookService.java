package net.datasa.web4.domain.GuestBook.Service;

import lombok.RequiredArgsConstructor;
import net.datasa.web4.domain.GuestBook.Dto.GuestBookDTO;
import net.datasa.web4.domain.GuestBook.Entity.GuestBookEntity;
import net.datasa.web4.domain.GuestBook.Repository.GuestBookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuestBookService {

    private final GuestBookRepository guestBookRepository;

    public void write(GuestBookDTO dto) {
        GuestBookEntity entity = new GuestBookEntity();
        entity.setName(dto.getName());
        entity.setPassword(dto.getPassword());
        entity.setMessage(dto.getMessage());

        guestBookRepository.save(entity); // ✅ 이제 문제 없음
    }



}
