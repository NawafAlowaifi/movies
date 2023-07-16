package com.example.nawaf.Services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nawaf.Models.MoviesModels;
import com.example.nawaf.Repo.MoviesRepo;
import com.example.nawaf.Services.MoviesServices;

@Service
public class MoviesServicesimpl implements MoviesServices {
       @Autowired
       private final MoviesRepo moviesRepo;
   
    public MoviesServicesimpl (MoviesRepo MoviesRepo){
        this.moviesRepo=MoviesRepo;
    }
    @Override
    public List<MoviesModels> findAllMovies() {
        return moviesRepo.findAll();
    }

    @Override
    public  Optional<MoviesModels> findbyID(Long id) {
       return moviesRepo.findById(id);
    }

    @Override
    public List<MoviesModels> FindTop10() {
        return moviesRepo.FindTop10();
    }
    @Override
    public List FindTopVotes() {
        return moviesRepo.FindTopVotes();
    }
    @Override
    public List MostRecent() {
     return moviesRepo.MostRecent();
    }
    @Override
    public List TopMeta() {
     return moviesRepo.TopMeta();
    }
    @Override
    public List ShorterRunTime() {
       return moviesRepo.ShorterRunTime();
    }
    // @Override
    // public boolean AddMovie(MoviesModels moviesModels) {
       

    // }
    
}
