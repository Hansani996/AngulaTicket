package lk.exe.moviebackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.exe.moviebackend.entity.Shows;

public interface ShowRepo extends JpaRepository<Shows, Integer>{
	
}
