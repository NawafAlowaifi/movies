package com.example.nawaf.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import com.example.nawaf.Models.MoviesModels;

public interface MoviesServices {
    List<MoviesModels> findAllMovies();
    <Optional>MoviesModels findbyID(Long id);
    
//   <optional> List<MoviesModels> FindTop10();
}
