package com.example.GoWatchMovies.Controllers;

import com.example.GoWatchMovies.Entities.Movie;
import com.example.GoWatchMovies.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gowatchmovies/api/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/allMovies")
    public ResponseEntity<List<Movie>> getAllMovies() {
        List<Movie> movies = movieService.allMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping("/imdb/{imdbId}")
    public ResponseEntity<Movie> getMovieById(@PathVariable String imdbId) {
        Optional<Movie> movie = movieService.singleMovie(imdbId);
        return movie.map(m -> new ResponseEntity<>(m, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
