package jSon;

public class TrainDetails {
	
	private String trainidentifier;
	private String trainacronym;
	
	TrainDetails(String trainacronym, String trainidentifier){
		this.trainidentifier= trainidentifier;
		this.trainacronym= trainacronym;
	}
	
	public String getTrainidentifier() {
		return trainidentifier;
	}
	public void setTrainidentifier(String trainidentifier) {
		this.trainidentifier = trainidentifier;
	}
	public String getTrainacronym() {
		return trainacronym;
	}
	public void setTrainacronym(String trainacronym) {
		this.trainacronym = trainacronym;
	}

	@Override
	public String toString() {
		return "TrainDetails [trainidentifier=" + trainidentifier + ", trainacronym=" + trainacronym + "]";
	}
	
	
	
	
	
}
