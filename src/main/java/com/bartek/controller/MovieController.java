package com.bartek.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bartek.model.Movie;
import com.bartek.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	MovieService movieService;

	

	@RequestMapping(value="/movies", method=RequestMethod.GET)
	public @ResponseBody List<Movie> findAllMovies() {
	    List<Movie> movies = new ArrayList<Movie>();
	    return movies;
	}

}
