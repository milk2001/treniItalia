package jSon;
import java.util.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Gestore {
	
	
	public void stampaSoluzioniViaggio(ArrayList<SoluzioneDiViaggio> l) {
		for(int i=0;i<l.size();i++) {
			System.out.println("\n#---Soluzione "+(i)+"---#\n");
			System.out.println(
					"COD: "+l.get(i).getIdsolution()+"\n"+
					"Origine: "+l.get(i).getOrigin()+"\n"+
					"Destinazione: "+l.get(i).getDestination()+"\n"+
					"Orario di partenza: "+calcolaOrario(l.get(i).getDeparturetime())+"\n"+
					"Orario di arrivo: "+calcolaOrario(l.get(i).getArrivaltime())+"\n"+
					"Durata viaggio: "+l.get(i).getDuration()+"\n"+
					"Costo minimo: "+l.get(i).getMinprice()+"€\n"+
					"Cambi previsiti: "+l.get(i).getChangesno()+"\nDETTAGLIO VIAGGIO");

			for(int j=0; j< l.get(i).getTreni().size();j++) {
				System.out.print("-"+j+" Treno: "+l.get(i).getTreni().get(j).getTrainidentifier());
				System.out.println(" | Cod: "+l.get(i).getTreni().get(j).getTrainacronym());
			}
		}
		
	}
	
	
	public void stampaDettaglioSoluzione(ArrayList<SoluzioneDiViaggioDetails> l) {
		for(int i=0;i<l.size();i++) {
			System.out.println("\n#---Convoglio "+(i)+"---#\n");
			System.out.println(
							"Id sol: "+l.get(i).getIdsolution()+"\n"+
							"Staz. Partenza: "+l.get(i).getDeparturestation()+"\n"+
							"Orario partenza: "+calcolaOrario(l.get(i).getDeparturetime())+"\n"+
							"Staz. Arrivo: "+l.get(i).getArrivalstation()+"\n"+
							"Orario arrivo: "+calcolaOrario(l.get(i).getArrivaltime())+"\n"+
							"Durata viaggio: "+l.get(i).getDuration()+"\nFERMATE\n");
			for(int j=0;j<l.get(i).getStoplist().size();j++) {
				System.out.println("st: "+l.get(i).getStoplist().get(j).getStationname()+"\n"+
						"Arrivo: "+calcolaOrario(l.get(i).getStoplist().get(j).getArrivaltime())+"\n"+
						"Partenza: "+calcolaOrario(l.get(i).getStoplist().get(j).getDeparturetime())+"\n");
			}
		}
		
	}
	
	
	private String calcolaOrario(Long dataLong) {
		Date currentTime = new Date(dataLong); 
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm dd-MM-yyyy"); 
		return formatter.format(currentTime);	
	}
	
	
	private String calcolaOrario(String dataIso) {
		if(!dataIso.equals("")) {
			ZonedDateTime  currentTime = ZonedDateTime.parse(dataIso);
		return DateTimeFormatter.ofPattern("HH:mm dd-MM-yyyy").format(currentTime);
		}else return "-";
	}

}




