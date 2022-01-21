package com.emanuelzaveruka.dsmovie.dto;

import com.emanuelzaveruka.dsmovie.entities.Movie;
import com.emanuelzaveruka.dsmovie.entities.Score;

import java.util.Set;

public class MovieDTO {

    private Long id;

    private String title;

    private Set<Score> score;

    private Integer count;

    private String image;

    public MovieDTO(){

    }

    public MovieDTO(Long id, String title, Set<Score> score, Integer count, String image) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }

    public MovieDTO(Movie movie) {
        id = movie.getId();
        title = movie.getTitle();
        score = movie.getScores();
        count = movie.getCount();
        image = movie.getImage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Score> getScore() {
        return score;
    }

    public void setScore(Set<Score> score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
