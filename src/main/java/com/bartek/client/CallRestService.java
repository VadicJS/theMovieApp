package com.bartek.client;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.bartek.model.Movie;
import com.bartek.model.Results;


@Component
public class CallRestService implements CommandLineRunner{

	static String key = "42d12d85ede57b5bfa1be1ff067db397";
	static String url = "https://api.themoviedb.org/3/discover/movie?api_key=42d12d85ede57b5bfa1be1ff067db397&language=pl&sort_by=popularity.desc&certification_country=pl&include_adult=true&include_video=true&page=1&year=2010&with_original_language=pl";

	
	private static void callRestService() {
		
		}


	@Override
	public void run(String... arg0) throws Exception {

		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		String resourceURL = url;
		HttpEntity<String> entity = new HttpEntity<String>(headers);
		ResponseEntity<Results> response = restTemplate.exchange(resourceURL,  HttpMethod.GET, entity, Results.class);
		Results results = response.getBody();
		List<Movie> movies = results.getResults();
		
		for(Movie movie : movies) {
			System.out.println(movie.originalTitle + ", adult: " + movie.isAdult() + ", release_date: "+ movie.getReleaseDate());
		}
		
	}
	
}
