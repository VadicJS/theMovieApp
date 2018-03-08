package com.bartek.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReviewResults {
	
	List<Review> results;

	public List<Review> getResults() {
		return results;
	}

	public void setResults(List<Review> results) {
		this.results = results;
	}
	
	
	

}
