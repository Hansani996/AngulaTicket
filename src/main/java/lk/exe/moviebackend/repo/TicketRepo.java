package lk.exe.moviebackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.exe.moviebackend.entity.Ticket;

public interface TicketRepo extends JpaRepository<Ticket, Integer>{

}
