package fr.castruche.formationDomService.app;

import fr.castruche.formationDomService.dao.SessionDAO;
import fr.castruche.formationDomService.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("fr.castruche.formationDomService")
@EnableJpaRepositories("fr.castruche.formationDomService.dao")
@EntityScan("fr.castruche.formationDomService.model")
public class FormationDomServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(FormationDomServiceApplication.class, args);
	}
}
