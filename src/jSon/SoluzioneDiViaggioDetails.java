package jSon;

import java.util.ArrayList;

public class SoluzioneDiViaggioDetails {
	
	private String idsolution;
	private String departurestation;
	private long departuretime;
	private String arrivalstation;
	private long arrivaltime;
	private String duration;
	private ArrayList<StopList> stoplist = new ArrayList<StopList>();
	
	
	
	
	
	public SoluzioneDiViaggioDetails(String idsolution, String departurestation, long departuretime,
			String arrivalstation, long arrivaltime, String duration, ArrayList<StopList> stoplist) {
		super();
		this.idsolution = idsolution;
		this.departurestation = departurestation;
		this.departuretime = departuretime;
		this.arrivalstation = arrivalstation;
		this.arrivaltime = arrivaltime;
		this.duration = duration;
		this.stoplist.addAll(stoplist);
	}
	public String getIdsolution() {
		return idsolution;
	}
	public void setIdsolution(String idsolution) {
		this.idsolution = idsolution;
	}
	public String getDeparturestation() {
		return departurestation;
	}
	public void setDeparturestation(String departurestation) {
		this.departurestation = departurestation;
	}
	public long getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(long departuretime) {
		this.departuretime = departuretime;
	}
	public String getArrivalstation() {
		return arrivalstation;
	}
	public void setArrivalstation(String arrivalstation) {
		this.arrivalstation = arrivalstation;
	}
	public long getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(long arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public ArrayList<StopList> getStoplist() {
		return stoplist;
	}
	public void setStoplist(ArrayList<StopList> stoplist) {
		this.stoplist = stoplist;
	}
	
	

}
