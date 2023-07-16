package com.example.nawaf.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

import com.example.nawaf.Models.MoviesModels;

public interface MoviesServices {
    List<MoviesModels> findAllMovies();

    Optional<MoviesModels> findbyID(Long id);

    List FindTop10();

    List FindTopVotes();

    List MostRecent();

    List TopMeta();

    List ShorterRunTime();

    // boolean AddMovie(MoviesModels moviesModels);
}
