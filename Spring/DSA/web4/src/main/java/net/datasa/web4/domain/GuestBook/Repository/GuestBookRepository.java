package net.datasa.web4.domain.GuestBook.Repository;


import net.datasa.web4.domain.GuestBook.Entity.GuestBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestBookRepository extends JpaRepository<GuestBookEntity, Integer> {


}
