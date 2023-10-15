package com.theatre.dto;

public class Seats {
	private int seatid;
	private int hallId;
	private String seatType;
	private int noOfSeatBooked;
	private  int totalSeat;
	public int getSeatid() {
		return seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
	public int getHallId() {
		return hallId;
	}
	public void setHallId(int hallId) {
		this.hallId = hallId;
	}
	public String getSeatType() {
		return seatType;
	}
	public void setSeatType(String seatType) {
		this.seatType = seatType;
	}
	public int getNoOfSeatBooked() {
		return noOfSeatBooked;
	}
	public void setNoOfSeatBooked(int noOfSeatBooked) {
		this.noOfSeatBooked = noOfSeatBooked;
	}
	public int getTotalSeat() {
		return totalSeat;
	}
	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}
	
	
}
