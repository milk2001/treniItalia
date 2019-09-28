package jSon;

import java.util.ArrayList;

public class SoluzioneDiViaggio {
	
	private String idsolution;
	private String origin;
	private String destination;
	private	String direction;
	private long departuretime;
	private long arrivaltime;
	private float minprice;
	private String duration;
	private int changesno;
	private boolean saleable;
	private ArrayList<TrainDetails> treni = new ArrayList<TrainDetails>();
	
	
	
	
	
	
	
	
	
	
	
	
	
	public SoluzioneDiViaggio() {}


	public SoluzioneDiViaggio(String idsolution, String origin, String destination, String direction,
			long departuretime, long arrivaltime, float minprice, String duration, int changesno, boolean saleable,
			ArrayList<TrainDetails> treni) {
		super();
		this.idsolution = idsolution;
		this.origin = origin;
		this.destination = destination;
		this.direction = direction;
		this.departuretime = departuretime;
		this.arrivaltime = arrivaltime;
		this.minprice = minprice;
		this.duration = duration;
		this.changesno = changesno;
		this.saleable = saleable;
		this.treni.addAll(treni);
	}
	
	
	@Override
	public String toString() {
		return "SoluzioneDiViaggio [\nidsolution=" + idsolution + ",\n minprice=" + minprice + ",\n changesno=" + changesno
				+ ",\n treni=\n" + treni + "]";
	}


	
	public String getIdsolution() {
		return idsolution;
	}
	public void setIdsolution(String idsolution) {
		this.idsolution = idsolution;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public long getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(long departuretime) {
		this.departuretime = departuretime;
	}
	public long getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(long arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public float getMinprice() {
		return minprice;
	}
	public void setMinprice(float minprice) {
		this.minprice = minprice;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getChangesno() {
		return changesno;
	}
	public void setChangesno(int changesno) {
		this.changesno = changesno;
	}

	public boolean isSaleable() {
		return saleable;
	}
	public void setSaleable(boolean saleable) {
		this.saleable = saleable;
	}
	public ArrayList<TrainDetails> getTreni() {
		return treni;
	}
	public void setTreni(ArrayList<TrainDetails> treni) {
		this.treni = treni;
	}
	
	
	

}
