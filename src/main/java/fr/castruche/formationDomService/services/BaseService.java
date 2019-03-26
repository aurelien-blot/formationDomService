package fr.castruche.formationDomService.services;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class BaseService<REPO extends JpaRepository<C, Integer>, C> {

    @PersistenceContext
    private EntityManager em;


}
