package jSon;

public class StopList {
	
	private String stationname;
	private String	arrivaltime;
	private	String departuretime;
	
	
	
	public StopList(String stationname, String arrivaltime, String departuretime) {
		super();
		this.stationname = stationname;
		this.arrivaltime = arrivaltime;
		this.departuretime = departuretime;
	}
	public String getStationname() {
		return stationname;
	}
	public void setStationname(String stationname) {
		this.stationname = stationname;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	

}
