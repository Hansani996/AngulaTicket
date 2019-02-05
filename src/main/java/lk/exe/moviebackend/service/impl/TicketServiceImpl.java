package lk.exe.moviebackend.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lk.exe.moviebackend.dto.TicketDto;
import lk.exe.moviebackend.entity.Ticket;
import lk.exe.moviebackend.repo.TicketRepo;
import lk.exe.moviebackend.service.TicketService;
@Service
public class TicketServiceImpl implements TicketService{
	@Autowired
	private TicketRepo ticketRepo;
	

	@Override
	public List<TicketDto> getAllTicket() {
		List<Ticket>allTickets=ticketRepo.findAll();
		List<TicketDto>list=new ArrayList<>();
		for(Ticket ti:allTickets) {
			
		}
		return list;
	}

}
