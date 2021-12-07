package com.portifolio.movie.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "genres")
public class GenreModel {

    @Id
   private String id;

   private String name;

   private int age;

   private boolean forKids;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isForKids() {
        return forKids;
    }

    public void setForKids(boolean forKids) {
        this.forKids = forKids;
    }
}
