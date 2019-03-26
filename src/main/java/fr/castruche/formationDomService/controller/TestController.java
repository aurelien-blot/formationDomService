package fr.castruche.formationDomService.controller;

import fr.castruche.formationDomService.dao.SessionDAO;
import fr.castruche.formationDomService.model.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class TestController {

    @Autowired
    SessionDAO sessionDAO;

    @GetMapping(value={"/"})
    public String test (@RequestParam("word") String word) {

        Session s1 =new Session(word);
        sessionDAO.save(s1);
        return "test";

    }
}
