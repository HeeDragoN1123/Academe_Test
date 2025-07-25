package net.datasa.web3.domain.Person.Repository;


import net.datasa.web3.domain.Person.Entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, String>{

}
