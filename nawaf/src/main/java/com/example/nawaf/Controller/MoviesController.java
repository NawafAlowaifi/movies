package com.example.nawaf.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nawaf.Models.MoviesModels;
import com.example.nawaf.Services.MoviesServices;

@RestController
@RequestMapping("/Movie")
public class MoviesController {
    private final MoviesServices MovieServices;
    public MoviesController(MoviesServices MoviesServices){
        this.MovieServices=MoviesServices;

    }
    // @GetMapping("/top")
    // public <optional> List<MoviesModels> FindTop10(){
    //     return MovieServices.FindTop10();
        
    // }
    @GetMapping("/all")
    public List<MoviesModels> findAllMovies(){
        return MovieServices.findAllMovies();
    }
}
