package com.example.nawaf.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.nawaf.Models.MoviesModels;

import jakarta.transaction.Transactional;

@Repository
public interface MoviesRepo extends JpaRepository<MoviesModels,Long> {
    // @Transactional
    // @Query("SELECT series_title,imdb_rating FROM movies WHERE imdb_rating IN (SELECT MAX(imdb_rating) FROM movies GROUP BY series_title,imdb_rating ORDER BY imdb_rating DESC )")
    // <optional> List<MoviesModels> FindTop10();
    
}
