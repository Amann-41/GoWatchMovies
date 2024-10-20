package com.example.GoWatchMovies.Service;

import com.example.GoWatchMovies.Entities.Review;
import com.example.GoWatchMovies.Repositories.ReviewRepository;
import org.springframework.stereotype.Service;

@Service
public interface ReviewService {

    public Review CreateReview(String ReviewBody , String imdbId);


}
