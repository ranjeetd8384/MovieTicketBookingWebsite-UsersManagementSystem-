package com.movieticketbooking.showz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Movies")
public class AdminInfo {

    // @Column

    // @SequenceGenerator(name = "movieIdSeq", sequenceName = "YOUR_SEQUENCE_NAME",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movieIdSeq")
    // @Id

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private int movieId;
    

    // private int movieId;
    private String movieName;
    private String releaseDate;
    private String director;
    private String actor;
    private String actress;
    private String details;

    public AdminInfo(int movieId, String movieName, String releaseDate, String director, String actor, String actress,
            String details) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.director = director;
        this.actor = actor;
        this.actress = actress;
        this.details = details;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getActress() {
        return actress;
    }

    public void setActress(String actress) {
        this.actress = actress;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "AdminInfo [movieId=" + movieId + ", movieName=" + movieName + ", releaseDate=" + releaseDate
                + ", director=" + director + ", actor=" + actor + ", actress=" + actress + ", details=" + details + "]";
    }

}
