package lk.exe.moviebackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name ="TID",nullable=false,length=10)
	private int tid;
	
	@Column(name= "TICKET_NO",nullable=false,length=10)
	private int ticket_NO;
	
	@ManyToOne
	@JoinColumn(name ="CID")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name ="SHOW_ID")
	private Shows shows;

	public Ticket(int tid, int ticket_NO, Customer customer, Shows shows) {
		super();
		this.tid = tid;
		this.ticket_NO = ticket_NO;
		this.customer = customer;
		this.shows = shows;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getTicket_NO() {
		return ticket_NO;
	}

	public void setTicket_NO(int ticket_NO) {
		this.ticket_NO = ticket_NO;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Shows getShows() {
		return shows;
	}

	public void setShows(Shows shows) {
		this.shows = shows;
	}

	@Override
	public String toString() {
		return "Ticket [tid=" + tid + ", ticket_NO=" + ticket_NO + ", customer=" + customer + ", shows=" + shows + "]";
	}
	
	
	
	
}
