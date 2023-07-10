package com.example.nawaf.Models;

import jakarta.persistence.*;

@Entity
@Table(name="movies")
public class MoviesModels {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    
    @Column(name="Poster_Link")
    private String Poster_Link;

    @Column(name="Series_Title")
    private String Series_Title;

    @Column(name="Released_Year")
    private String Released_Year;

    @Column(name="Certificate")
    private String Certificate;

    @Column(name="Runtime")
    private String Runtime;

    @Column(name="Genre")
    private String Genre;

    
    @Column(name="IMDB_Rating")
    private double IMDB_Rating;

    @Column(name="Overview",columnDefinition = "TEXT")
    private String Overview;

    
    @Column(name="Meta_score")
    private String Meta_score;


    @Column(name="No_of_Votes")
    private String No_of_Votes;



}
