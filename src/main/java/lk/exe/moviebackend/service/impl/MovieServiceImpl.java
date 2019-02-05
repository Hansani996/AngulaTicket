package lk.exe.moviebackend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.exe.moviebackend.dto.MoviesDto;
import lk.exe.moviebackend.entity.Movies;
import lk.exe.moviebackend.repo.MovieRepo;
import lk.exe.moviebackend.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	private MovieRepo movieRepo;

	@Override
	public List<MoviesDto> allMovies() {
		List<Movies>allM=movieRepo.findAll();
		List<MoviesDto>movieD=new ArrayList<>();
		for(Movies mo:allM) {
			movieD.add(new MoviesDto(mo.getMid(),mo.getmNmae(), mo.getReleseDate(), mo.getDirector()));
			
		}
		return movieD;
	}
	
	

}
