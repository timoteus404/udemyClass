package com.example.udemyClass.controllers;

import com.example.udemyClass.repository.BookRepository;
import com.example.udemyClass.repository.PublisherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublisherController {

    private final PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @RequestMapping( "/publisher")
    public String getPublisher(Model model){

        model.addAttribute("publisher", publisherRepository.findAll());

        return "books/publisher";

    }
}
