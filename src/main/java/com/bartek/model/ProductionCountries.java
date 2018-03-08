package com.bartek.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductionCountries {
	
	@JsonProperty("iso_3166_1")
	public String iso_3166_1;
	
	@JsonProperty("name")
	public String name;
	
	

}
