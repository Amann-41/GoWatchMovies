package com.example.GoWatchMovies.Controllers;

import com.example.GoWatchMovies.Entities.Review;
import com.example.GoWatchMovies.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/gowatchmovies/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> CreateReview(@RequestBody Map<String,String> payload){
        return new ResponseEntity<Review>(reviewService.CreateReview(payload.get("ReviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }

}
