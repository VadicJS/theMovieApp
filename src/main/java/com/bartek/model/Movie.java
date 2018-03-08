package com.bartek.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Movie {
	
	@JsonProperty("id")
	public long id;
	
	@JsonProperty("original_title")
	public String originalTitle;
	
	@JsonProperty("title")
	public String title;
	
	@JsonProperty("original_language")
	public String originalLanguage;
	
	@JsonProperty("popularity")
	public double popularity;
	
	@JsonProperty("adult")
	public boolean adult;
	
	@JsonProperty("overview")
	public String overview;
	
	@JsonProperty("release_date")
	public String releaseDate;
	
	@JsonProperty("vote_average")
	public double voteAverage;
	
	@JsonProperty("poster_path")
	public String posterPath;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
	public double getVoteAverage() {
		return voteAverage;
	}

	public void setVoteAverage(double voteAverage) {
		this.voteAverage = voteAverage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public double getPopularity() {
		return popularity;
	}

	public void setPopularity(double popularity) {
		this.popularity = popularity;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	
	


}
