package com.parse.starter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarPosting {
	private String pickUpLocation;
	private String pickUpIntersec;
	private String dropOffLocation;
	private String dropOffIntersec;
	private Integer numSeats;
	private String exactLocation;
	private Date pickUpTime;
	private Integer lengthRide;
	private Float price;
	private List<String> otherStops;
	private Boolean luggageSpace;
	private String additionalDetails;
	private Boolean cancelled;
	private Date postTime;
	private Date cancelTime;
	private String userName;
	
	public CarPosting(){
		pickUpLocation = "Toronto";
		dropOffLocation = "Ottawa";
		pickUpIntersec = "Bloor-Dundas";
		dropOffIntersec = "Bank-Huntley";
		numSeats = 0;
		exactLocation = "K3A 1W0";
		pickUpTime = new Date();
		lengthRide = 0;
		price = 0.0f;
		otherStops = new ArrayList<String>();
		luggageSpace = false;
		additionalDetails = "";
		cancelled = false;
		postTime = new Date();
		cancelTime = new Date();
		userName = "abaek";	
		
	}
	
	public CarPosting(String pickUp, String dropOff, Integer seats, String exact, Date timePickUp, Integer rideLength, Float p,
			List<String> other, Boolean luggage, String details, Boolean ifCancelled, Date timePost, Date timeCancel, String userID){
		pickUpLocation = pickUp;
		dropOffLocation = dropOff;
		numSeats = seats;
		exactLocation = exact;
		pickUpTime = timePickUp;
		lengthRide = rideLength;
		price = p;
		otherStops = other;
		luggageSpace = luggage;
		additionalDetails = details;
		cancelled = ifCancelled;
		postTime = timePost;
		cancelTime = timeCancel;
		userName = userID;	
		
	}
	
	public String getPickUpLocation(){
		return pickUpLocation;
	}
	
	public String getDropOffLocation(){
		return dropOffLocation;
	}
	
	public Integer getNumSeats(){
		return numSeats;
	}
	
	public String getExactLocation(){
		return exactLocation;
	}
	
	public Date getPickUpTime(){
		return pickUpTime;
	}
	
	public Integer getRideLength(){
		return lengthRide;
	}
	
	public Float getPrice(){
		return price;
	}
	
	public List<String> getOtherStops(){
		return otherStops;
	}
	
	public Boolean getLuggageSpace(){
		return luggageSpace;
	}
	
	public String getAdditionalDetails(){
		return additionalDetails;
	}
	
	public Boolean getCancelled(){
		return cancelled;
	}
	
	public Date getPostTime(){
		return postTime;
	}
	
	public  Date getCancelTime(){
		return cancelTime;
	}
	
	public String getUserName(){
		return userName;
	}
	
	public String getPickUpIntersec(){
		return pickUpIntersec;
	}
	
	public String getDropOffIntersec(){
		return dropOffIntersec;
	}
	
}