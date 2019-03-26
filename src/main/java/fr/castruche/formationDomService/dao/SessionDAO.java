package fr.castruche.formationDomService.dao;

import fr.castruche.formationDomService.model.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionDAO extends JpaRepository<Session, Long> {


}
