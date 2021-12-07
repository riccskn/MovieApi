package com.portifolio.movie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "movies")
public class MovielModel {

    @Id
    private String id;

    private String name;

    private String synopsis;

    private String genre;

    private List<String> actors = new ArrayList<>();

    public MovielModel() {

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "MovielModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", actors=" + actors +
                '}';
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
