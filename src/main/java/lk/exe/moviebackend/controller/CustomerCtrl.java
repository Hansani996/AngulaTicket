package lk.exe.moviebackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.exe.moviebackend.dto.CustomerDto;
import lk.exe.moviebackend.service.CustomerService;
@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerCtrl {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/save")
	public void addCustomer(@RequestBody CustomerDto cusDto) {
		customerService.addCustomer(cusDto);
	}
	
	
}
