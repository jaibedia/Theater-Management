package com.theatre.dto;

public class TicketCounter {
	private int ticketId;
	private String customerId;
	private int hallId;
	private String movienName;
	private int ticketPrice;
	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getMovienName() {
		return movienName;
	}
	public void setMovienName(String movienName) {
		this.movienName = movienName;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
}
