package com.bartek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bartek.client.CallRestService;
import com.bartek.model.Movie;

@SpringBootApplication
@ComponentScan({"com.bartek.client"})
public class TheMovieDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheMovieDbApplication.class, args);
		
		
	}
}
