package com.example.GoWatchMovies.Service;

import com.example.GoWatchMovies.Entities.Review;
import com.example.GoWatchMovies.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImple implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Override
    public Review CreateReview(String ReviewBody, String imdbId) {
        Review review = new Review(ReviewBody);
        reviewRepository.save(review);
        return review;
    }
}
