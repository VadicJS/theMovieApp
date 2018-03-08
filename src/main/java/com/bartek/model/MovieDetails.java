package com.bartek.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetails extends Movie {
	
	
	
	@JsonProperty("budget")
	public long budget;
	
	@JsonProperty("homepage")
	public String homepage;
		
	@JsonProperty("revenue")
	public long revenue;
	
	@JsonProperty("release_date")
	public String releaseDate;
	
	@JsonProperty("status")
	public String status;
	
	@JsonProperty("production_companies")
	List<ProductionCompanies> productionCompanies;
	
	@JsonProperty("production_countries")
	List<ProductionCountries> productionCountries;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getBudget() {
		return budget;
	}

	public void setBudget(long budget) {
		this.budget = budget;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getOriginalTitle() {
		return originalTitle;
	}

	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	public String getOriginalLanguage() {
		return originalLanguage;
	}

	public void setOriginalLanguage(String originalLanguage) {
		this.originalLanguage = originalLanguage;
	}

	public String getOverview() {
		return overview;
	}

	public void setOverview(String overview) {
		this.overview = overview;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	public long getRevenue() {
		return revenue;
	}

	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	
	

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<ProductionCountries> getProductionCountries() {
		return productionCountries;
	}

	public void setProductionCountries(List<ProductionCountries> productionCountries) {
		this.productionCountries = productionCountries;
	}

	public List<ProductionCompanies> getProductionCompanies() {
		return productionCompanies;
	}

	public void setProductionCompanies(List<ProductionCompanies> productionCompanies) {
		this.productionCompanies = productionCompanies;
	}

		
}
