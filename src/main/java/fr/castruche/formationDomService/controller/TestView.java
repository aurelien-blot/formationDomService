package fr.castruche.formationDomService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestView {

    @GetMapping(value={"", "/"})
    public String search() {
        return "/test/test";
    }
}
