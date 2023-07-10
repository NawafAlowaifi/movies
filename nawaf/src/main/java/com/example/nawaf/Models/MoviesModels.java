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
    private int Released_Year;

    @Column(name="Certificate")
    private String Certificate;

    @Column(name="Runtime")
    private int Runtime;

    @Column(name="Genre")
    private String Genre;

    
    @Column(name="IMDB_Rating")
    private double IMDB_Rating;

    @Column(name="Overview")
    private String Overview;

    
    @Column(name="Meta_score")
    private int Meta_score;


    @Column(name="No_of_Votes")
    private int No_of_Votes;



}
