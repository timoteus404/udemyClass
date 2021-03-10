package com.example.udemy_class.controller;

import com.example.udemy_class.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
public class PublisherController {


    private final PublisherRepository publisherRepository;

    @RequestMapping("/publishers")
    public String getPublisher(Model model){

        model.addAttribute("publishers", publisherRepository.findAll());

        return "publishers/list";
    }
}
