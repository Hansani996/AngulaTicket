package lk.exe.moviebackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.exe.moviebackend.entity.Movies;

public interface MovieRepo extends JpaRepository<Movies,Integer>{

}
