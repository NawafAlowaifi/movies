package com.example.nawaf.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nawaf.Models.MoviesModels;
import com.example.nawaf.Services.MoviesServices;

@RestController
@RequestMapping("/Movie")
public class MoviesController {
    private final MoviesServices MovieServices;
    @Autowired
    public MoviesController(MoviesServices MoviesServices){
        this.MovieServices=MoviesServices;

    }
    @GetMapping("/top10")
    public  List FindTop10(){
        return MovieServices.FindTop10();
        
    }
    @GetMapping("/all")
    public List<MoviesModels> findAllMovies(){
        return MovieServices.findAllMovies();
    }

    @GetMapping("/find/{id}")
    public Optional<MoviesModels> findById(@PathVariable("id") Long id){
        return MovieServices.findbyID(id);

    } 
    @GetMapping("/topvotes")
    public List FindTopVotes(){
        return MovieServices.FindTopVotes();
    }

    @GetMapping("/mostrecent")
    public List MostRecent(){
        return MovieServices.MostRecent();
    }

    @GetMapping("/topmeta")
    public List TopMeta(){
        return MovieServices.TopMeta();
    }

    @GetMapping("/shorterruntime")
    public List ShorterRunTime(){
        return MovieServices.ShorterRunTime();
    }

}
