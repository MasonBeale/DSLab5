/*
 * abbas?
 */

public class Passenger {
	private int seatNumber;
	private String name;
	private String airlineName;
	private String seatClass;
	private Boolean check =false;
	
	public Passenger(int sit, String nm, String an, String sc) {
		seatNumber = sit;
		name = nm;
		airlineName = an;
		seatClass = sc;
	}

	/**
	 * @return the seatNumber
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the airlineName
	 */
	public String getAirlineName() {
		return airlineName;
	}

	/**
	 * @return the seatClass
	 */
	public String getSeatClass() {
		return seatClass;
	}

	/**
	 * 
	 * @param b
	 */
	public Boolean setCheckIn(boolean b) {
		check=b;
		return check;
		
	}

	public Boolean getCheck() {
		return check;
	}
	
	public String toString() {
		return name+" "+seatNumber+" "+seatClass;
	}
	
}
