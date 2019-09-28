package jSon;


import java.util.ArrayList;
import org.json.JSONArray;

public class ParseJSON {

	public ArrayList<SoluzioneDiViaggio> parseSoluzioni(String json) {
		
		JSONArray arrayJsonData = new JSONArray(json);
		ArrayList<SoluzioneDiViaggio> ArraySoluzione = new ArrayList<SoluzioneDiViaggio>();
		ArrayList<TrainDetails> ArrayTreniXSoluzione = new ArrayList<TrainDetails>();
		
		for (int i = 0; i < arrayJsonData.length(); i++) {
			ArrayTreniXSoluzione.clear();
			for (int j = 0; j <arrayJsonData.getJSONObject(i).getJSONArray("trainlist").length(); j++) {
				
				ArrayTreniXSoluzione.add(new TrainDetails(
						arrayJsonData.getJSONObject(i).getJSONArray("trainlist").getJSONObject(j).getString("trainacronym"),
						arrayJsonData.getJSONObject(i).getJSONArray("trainlist").getJSONObject(j).getString("trainidentifier")));
				
			}
			ArraySoluzione.add(new SoluzioneDiViaggio(
				arrayJsonData.getJSONObject(i).getString("idsolution"),
				arrayJsonData.getJSONObject(i).getString("origin"),
				arrayJsonData.getJSONObject(i).getString("destination"),
				arrayJsonData.getJSONObject(i).getString("direction"),
				arrayJsonData.getJSONObject(i).getLong("departuretime"),
				arrayJsonData.getJSONObject(i).getLong("arrivaltime"),
				arrayJsonData.getJSONObject(i).getFloat("minprice"),
				arrayJsonData.getJSONObject(i).getString("duration"),
				arrayJsonData.getJSONObject(i).getInt("changesno"),
				arrayJsonData.getJSONObject(i).getBoolean("saleable"),
				ArrayTreniXSoluzione));
		}
		return ArraySoluzione;
	}
	
	
	public ArrayList<SoluzioneDiViaggioDetails> parseSoluzioneDetails(String json){
		JSONArray arrayJsonData = new JSONArray(json);
		ArrayList<SoluzioneDiViaggioDetails> ArraySoluzione = new ArrayList<SoluzioneDiViaggioDetails>();
		ArrayList<StopList> ArrayStopList = new ArrayList<StopList>();
		for (int i = 0; i < arrayJsonData.length(); i++) {
			ArrayStopList.clear();
			for(int j=0; j<arrayJsonData.getJSONObject(i).getJSONArray("stoplist").length();j++) {
				ArrayStopList.add(new StopList(
						arrayJsonData.getJSONObject(i).getJSONArray("stoplist").getJSONObject(j).getString("stationname"),
						arrayJsonData.getJSONObject(i).getJSONArray("stoplist").getJSONObject(j).optString("arrivaltime"),
						arrayJsonData.getJSONObject(i).getJSONArray("stoplist").getJSONObject(j).optString("departuretime")));
			}
			ArraySoluzione.add(new SoluzioneDiViaggioDetails(
					arrayJsonData.getJSONObject(i).getString("idsolution"),
					arrayJsonData.getJSONObject(i).getString("departurestation"),
					arrayJsonData.getJSONObject(i).getLong("departuretime"),
					arrayJsonData.getJSONObject(i).getString("arrivalstation"),
					arrayJsonData.getJSONObject(i).getLong("arrivaltime"),
					arrayJsonData.getJSONObject(i).getString("duration"),
					ArrayStopList));	
		}
		return ArraySoluzione;		
	}
	
	
	
}
