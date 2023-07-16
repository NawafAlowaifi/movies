package com.example.nawaf.dto.Request;

import java.io.Serializable;

import jakarta.persistence.Column;

public class MovieRequest implements Serializable {

    private String Poster_Link;

    private String Series_Title;

    private String Released_Year;

    private String Certificate;

    private String Runtime;

    private String Genre;

    private double IMDB_Rating;

    private String Overview;

    private Integer Meta_score;

    private Integer No_of_Votes;

    

   

    public String getPoster_Link() {
        return Poster_Link;
    }

    public void setPoster_Link(String poster_Link) {
        Poster_Link = poster_Link;
    }

    public String getSeries_Title() {
        return Series_Title;
    }

    public void setSeries_Title(String series_Title) {
        Series_Title = series_Title;
    }

    public String getReleased_Year() {
        return Released_Year;
    }

    public void setReleased_Year(String released_Year) {
        Released_Year = released_Year;
    }

    public String getCertificate() {
        return Certificate;
    }

    public void setCertificate(String certificate) {
        Certificate = certificate;
    }

    public String getRuntime() {
        return Runtime;
    }

    public void setRuntime(String runtime) {
        Runtime = runtime;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public double getIMDB_Rating() {
        return IMDB_Rating;
    }

    public void setIMDB_Rating(double iMDB_Rating) {
        IMDB_Rating = iMDB_Rating;
    }

    public String getOverview() {
        return Overview;
    }

    public void setOverview(String overview) {
        Overview = overview;
    }

    public Integer getMeta_score() {
        return Meta_score;
    }

    public void setMeta_score(Integer meta_score) {
        Meta_score = meta_score;
    }

    public Integer getNo_of_Votes() {
        return No_of_Votes;
    }

    public void setNo_of_Votes(Integer no_of_Votes) {
        No_of_Votes = no_of_Votes;
    }
}
