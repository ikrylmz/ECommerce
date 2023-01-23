package com.bilgeadam.ecommerce.controller;


import com.bilgeadam.ecommerce.model.Deneme;
import com.bilgeadam.ecommerce.service.DenemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "deneme")
public class DenemeController {


    @Autowired
    private DenemeService denemeService;

    @GetMapping(path = "getName", produces = MediaType.APPLICATION_JSON_VALUE)
    @CrossOrigin(origins = "http://localhost:8000")
    public List<Deneme> getAllMoviesController() {
        // localhost:8080/movies/getName
        List<Deneme> liste = denemeService.getAllMoviesService();
        return liste;
    }
}
