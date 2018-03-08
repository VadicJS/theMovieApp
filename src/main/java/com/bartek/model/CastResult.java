package com.bartek.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CastResult {
	
	@JsonProperty("id")
	public long id;
	
	@JsonProperty("cast")
	List<Cast> cast;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Cast> getCast() {
		return cast;
	}

	public void setCast(List<Cast> cast) {
		this.cast = cast;
	}
	
	

}
