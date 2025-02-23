package com.mb.controller;

import com.mb.domain.Genre;
import com.mb.dto.MovieDto;
import com.mb.service.MovieService;
import jakarta.persistence.GeneratedValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @GetMapping
    public List<MovieDto> getAll(){

        return  this.movieService.getAll();
    }

    @GetMapping("{genre}")
    public List<MovieDto> getAll(@PathVariable Genre genre){

        return  this.movieService.getAll(genre);
    }


}
