package lk.exe.moviebackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.exe.moviebackend.dto.TicketDto;
import lk.exe.moviebackend.service.TicketService;

@RestController
@CrossOrigin
@RequestMapping("/ticket")
public class TicketCtrl {
	
	@Autowired
	private TicketService ticketService;

	@GetMapping("/allTicket")
	public List<TicketDto>allTicket(){
		return ticketService.getAllTicket();
		
	}
}
