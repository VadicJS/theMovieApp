package com.bartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bartek.model.Movie;

@Service
public class MovieService {
	@Autowired
	public Movie movie;

	public Movie getMovie() {
		return movie;
	}
	
}
