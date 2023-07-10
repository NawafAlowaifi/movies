package com.example.nawaf.Services;

import java.util.List;

import com.example.nawaf.Models.MoviesModels;

public interface MoviesServices {
    List<MoviesModels> findAllMovies();
    <Optional>MoviesModels findbyID(Long id);
    // @Query()
}
