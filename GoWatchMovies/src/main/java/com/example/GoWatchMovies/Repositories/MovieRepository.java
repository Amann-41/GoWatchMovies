package com.example.GoWatchMovies.Repositories;

import com.example.GoWatchMovies.Entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie,String> {
    Optional<Movie> findByImdbId(String imdbId);
}
