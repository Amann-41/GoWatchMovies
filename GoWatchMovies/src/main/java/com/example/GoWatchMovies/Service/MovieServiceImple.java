package com.example.GoWatchMovies.Service;

import com.example.GoWatchMovies.Entities.Movie;
import com.example.GoWatchMovies.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImple implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }

}
