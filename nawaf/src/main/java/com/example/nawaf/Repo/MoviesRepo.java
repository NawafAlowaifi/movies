package com.example.nawaf.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.nawaf.Models.MoviesModels;

import jakarta.transaction.Transactional;

@Repository
public interface MoviesRepo extends JpaRepository<MoviesModels, Long> {
    @Transactional
    @Query(nativeQuery = true, value = "SELECT series_title,imdb_rating FROM movies WHERE imdb_rating IN (SELECT MAX(imdb_rating) FROM movies GROUP BY series_title,imdb_rating ORDER BY imdb_rating DESC LIMIT 10 )")
    List FindTop10();

    @Transactional
    @Query(nativeQuery = true, value = "SELECT series_title,no_of_votes FROM movies ORDER BY no_of_votes DESC ")
    List FindTopVotes();

    @Transactional
    @Query(nativeQuery = true, value = "SELECT series_title,released_year FROM movies ORDER BY released_year DESC")
    List MostRecent();

    @Transactional
    @Query(nativeQuery = true, value = "SELECT series_title,meta_score FROM movies WHERE meta_score IS NOT NULL ORDER BY meta_score DESC")
    List TopMeta();

    @Transactional
    @Query(nativeQuery = true, value = "SELECT series_title ,CONCAT(CAST(shortest AS varchar),' min') as shortest FROM( SELECT series_title,CAST(SUBSTRING(runtime,1,3)AS int)  as shortest FROM movies order by shortest) as t")
    List ShorterRunTime();

}
