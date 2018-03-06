package com.bartek.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {
List<Movie> results;

	@JsonProperty("total_results")
	private int totalResults;

	public List<Movie> getResults() {
		return results;
	}

	public void setResults(List<Movie> results) {
		this.results = results;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
	}
	
	
}
