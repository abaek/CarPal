import java.util.Date;
import java.util.List;

public class CarPosting {
	private String pickUpLocation;
	private String dropOffLocation;
	private Integer numSeats;
	private String exactLocation;
	private Date pickUpTime;
	private Date arrivalTime;
	private Float price;
	private List<String> otherStops;
	private Integer luggageSpace;
	private String additionalDetails;
	private Boolean cancelled;
	private Date postTime;
	private Date cancelTime;
	private String userName;

	public CarPosting(String pickUp, String dropOff, Integer seats, String exact, Date timePickUp, Date timeArrival, Float p,
			List<String> other, Integer luggage, String details, Boolean ifCancelled, Date timePost, Date timeCancel, String userID){
		pickUpLocation = pickUp;
		dropOffLocation = dropOff;
		numSeats = seats;
		exactLocation = exact;
		pickUpTime = timePickUp;
		arrivalTime = timeArrival;
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

	public Date getArrivalTime(){
		return arrivalTime;
	}

	public Float getPrice(){
		return price;
	}

	public List<String> getOtherStops(){
		return otherStops;
	}

	public Integer getLuggageSpace(){
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
}



