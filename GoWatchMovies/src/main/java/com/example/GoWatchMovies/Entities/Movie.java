package com.example.GoWatchMovies.Entities;

import com.example.GoWatchMovies.converters.StringListConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;

    @Convert(converter = StringListConverter.class)
    private List<String> genres;

    @Convert(converter = StringListConverter.class)
    private List<String> backdrops;

     @OneToMany
     private List<Review> reviewIds;
}
