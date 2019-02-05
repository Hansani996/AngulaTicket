package lk.exe.moviebackend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.exe.moviebackend.dto.CustomerDto;
import lk.exe.moviebackend.entity.Customer;
import lk.exe.moviebackend.repo.CustomerRepo;
import lk.exe.moviebackend.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	public CustomerRepo customerRepo;
	
	@Override
	public void addCustomer(CustomerDto cusDto) {
		Customer customer=new Customer(cusDto.getCid(),cusDto.getName(), cusDto.getEmail(), cusDto.getPhoneNo());
		customerRepo.save(customer);
	
	
	}
}
