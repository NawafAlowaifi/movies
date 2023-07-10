package com.example.nawaf.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.nawaf.Models.MoviesModels;

@Repository
public interface MoviesRepo extends JpaRepository<MoviesModels,Long> {
    
}
