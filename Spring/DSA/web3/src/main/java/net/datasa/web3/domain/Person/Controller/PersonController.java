package net.datasa.web3.domain.Person.Controller;

import net.datasa.web3.domain.Person.Entity.PersonEntity;
import net.datasa.web3.domain.Person.Repository.PersonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/springtest")
    public String savePerson() {
        PersonEntity person = new PersonEntity();
        person.Id("testuser");
        person.setName("홍길동");
        person.setPassword("1234");
        person.setPhone("010-1234-5678");
        person.setCom("테스트회사");

        personRepository.save(person);

        return "redirect:/";
    }
}