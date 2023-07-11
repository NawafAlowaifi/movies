package com.example.nawaf.Services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nawaf.Models.MoviesModels;
import com.example.nawaf.Repo.MoviesRepo;
import com.example.nawaf.Services.MoviesServices;

@Service
public class MoviesServicesimpl implements MoviesServices {
    // @Autowired
    private final MoviesRepo moviesRepo;
    public MoviesServicesimpl (MoviesRepo MoviesRepo){
        this.moviesRepo=MoviesRepo;
    }
    @Override
    public List<MoviesModels> findAllMovies() {
        return moviesRepo.findAll();
    }

    @Override
    public <Optional> MoviesModels findbyID(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findbyID'");
    }

    // @Override
    // public List<MoviesModels> FindTop10() {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'FindTop10'");
    // }
    
}
