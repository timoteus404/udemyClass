package com.example.udemy_class.controller;

import com.example.udemy_class.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    @RequestMapping("authors")
    public String getAuthor(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors/list";
    }
}
