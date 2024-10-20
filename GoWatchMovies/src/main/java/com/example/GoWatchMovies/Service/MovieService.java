package com.example.GoWatchMovies.Service;

import com.example.GoWatchMovies.Entities.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    public List<Movie> allMovies();
    public Optional<Movie> singleMovie(String id);
}
