package com.bartek.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bartek.model.Cast;
import com.bartek.model.Movie;
import com.bartek.model.MovieDetails;
import com.bartek.model.Review;
import com.bartek.service.Util;

@RestController
public class MovieController {


	
 /* top_rated
  * popular
  * upcoming
  * now_playing
  */
	@GetMapping(value = "/api/{param}")
	public List<Movie> getMovies(@PathVariable String param){
		return Util.getList(param);
	}
	
	@GetMapping(value = "/api/movie/{movieId}")
	public MovieDetails getMovie(@PathVariable long movieId) {
		return Util.getMovie(movieId);
	}
	
	/*
	 * similar
	 */
	@GetMapping(value = "/api/movie/{movieId}/{param}")
	public List<Movie> getMoviesforMovie(@PathVariable int movieId, @PathVariable String param){
		return Util.getForMovie(movieId, param);
	}

	
	/*
	 * credits
	 */
	
	@GetMapping(value = "/api/movie/{movieId}/credits")
	public List<Cast> getCast(@PathVariable long movieId){
		return Util.getCast(movieId);
	}
	
	/*
	 * reviews
	 */
	
	@GetMapping(value = "/api/movie/{movieId}/reviews")
	public List<Review> getReview(@PathVariable long movieId){
		return Util.getReview(movieId);
	}
}
