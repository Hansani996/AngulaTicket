package lk.exe.moviebackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.exe.moviebackend.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {

}
