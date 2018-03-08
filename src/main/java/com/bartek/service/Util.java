package com.bartek.service;

import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.bartek.model.Cast;
import com.bartek.model.CastResult;
import com.bartek.model.Movie;
import com.bartek.model.MovieDetails;
import com.bartek.model.Results;
import com.bartek.model.Review;
import com.bartek.model.ReviewResults;


public class Util {

	
	private Util() {
		
	}

	private static String baseUrl =	"https://api.themoviedb.org/3/movie/";
	private static String apiKey = "?api_key=42d12d85ede57b5bfa1be1ff067db397";
		

	public static Movie getLatest(){
		RestTemplate restTemplate = new RestTemplate();
		String resourceURL = baseUrl + "latest?api_key=" + apiKey;
		Movie response = restTemplate.getForObject(resourceURL, Movie.class);
		return response;
		}
	
	
	public static MovieDetails getMovie(long movieId) {
		RestTemplate restTemplate = new RestTemplate();
		String resourceURL = baseUrl + movieId + apiKey;
		MovieDetails response = restTemplate.getForObject(resourceURL, MovieDetails.class);
		return response;
	}
	
	
	public static List<Movie> getList(String midUrl){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceURL = baseUrl + midUrl + apiKey;
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Results> response = restTemplate.exchange(resourceURL,  HttpMethod.GET, entity, Results.class);
		Results results = response.getBody();
		List<Movie> movies = results.getResults();
		return movies;
	}
	
	
	public static List<Movie> getForMovie(int movieId, String param){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceURL = baseUrl + movieId+"/"+param + apiKey;
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Results> response = restTemplate.exchange(resourceURL,  HttpMethod.GET, entity, Results.class);
		Results results = response.getBody();
		List<Movie> movies = results.getResults();
		return movies;
	}
	
	public static List<Cast> getCast(long movieId){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceURL = baseUrl + movieId+"/credits" + apiKey;
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<CastResult> response = restTemplate.exchange(resourceURL,  HttpMethod.GET, entity, CastResult.class);
		CastResult results = response.getBody();
		List<Cast> cast = results.getCast();
		return cast;
	}
	
	public static List<Review> getReview(long movieId){
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceURL = baseUrl + movieId+"/reviews" + apiKey;
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<ReviewResults> response = restTemplate.exchange(resourceURL,  HttpMethod.GET, entity, ReviewResults.class);
		ReviewResults results = response.getBody();
		List<Review> review = results.getResults();
		return review;
	}
	
	
}
