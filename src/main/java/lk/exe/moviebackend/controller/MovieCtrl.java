package lk.exe.moviebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.exe.moviebackend.dto.MoviesDto;
import lk.exe.moviebackend.service.MovieService;

@RestController
@CrossOrigin
@RequestMapping("movie")
public class MovieCtrl {

	@Autowired
	private MovieService movieService;
	
	@GetMapping("/all")
	public List<MoviesDto>getAllMovies(){
		return movieService.allMovies();
	}
}
