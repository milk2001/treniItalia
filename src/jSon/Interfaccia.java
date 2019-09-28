package jSon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Interfaccia {

	public void avvia() throws IOException {
		
		BrowserHTTP bHttp = new BrowserHTTP();
		ParseJSON parser = new ParseJSON();
		Gestore gestoreStampa = new Gestore();
		ParametriSoluzione p = new ParametriSoluzione();
		ArrayList<SoluzioneDiViaggio> z;
	
		gestoreStampa.stampaSoluzioniViaggio(z=parser.parseSoluzioni(bHttp.sendGet(stringaSoluzione(inserimentoValori(),0), true)));
	
		gestoreStampa.stampaDettaglioSoluzione(parser.parseSoluzioneDetails(bHttp.sendGet(stringaDettaglioSoluz(getStringDettaglio(z)), false)));
		
		
		
	}
	
	private String stringaSoluzione(ParametriSoluzione p,int offset) {
		String s;
		s = "https://www.lefrecce.it/msite/api/solutions?origin="+p.getStazionePartenza()+
			"&destination="+p.getStazioneArrivo()+
			"&arflag=[AR]&adate="+p.getData()+
			"&atime="+p.getOra()+
			"&offset="+offset+
			"&adultno="+p.getAdulti()+
			"&childno="+p.getBambini()+
			"&direction="+"A"+
			"&frecce="+p.isFreccia()+
			"&onlyRegional="+p.isRegionali();	
		return s;
	}
	
	private String stringaDettaglioSoluz(String idSol) {
		String s;
		s ="https://www.lefrecce.it/msite/api/solutions/"+idSol+"/details";
		return s;
	}
	
	private ParametriSoluzione inserimentoValori() {
		Scanner scanner = new Scanner(System.in); 
		ParametriSoluzione p = new ParametriSoluzione();
		System.out.println("Impostazione dei parametri di ricerca soluzione");
		System.out.println("Inserire stazione di partenza ");
		p.setStazionePartenza(scanner.nextLine());
		System.out.println("Inserire stazione di arrivo ");
		p.setStazioneArrivo(scanner.nextLine());
		System.out.println("Inserire data (gg/MM/YYYY) ");
		p.setData(scanner.nextLine());
		System.out.println("Inserire orario di partenza (HH:mm) ");
		p.setOra(scanner.nextLine());
		System.out.println("Inserire numero di adulti ");
		p.setAdulti(scanner.nextLine());
		System.out.println("Inserire numero di bambini ");
		p.setBambini(scanner.nextLine());
		System.out.println("Inserisci\n1 per visualizzare solo i treni veloci\n2 per visualizzare tutti i treni");
		if(scanner.nextLine().equals("1")) {
			p.setFreccia(true);
			p.setRegionali(false);
		}else {
			p.setFreccia(false);
			p.setRegionali(false);
		}
		
		
		System.out.println("Sto cercando soluzioni per: ");
		System.out.println(p.toString());
		return p;
	}
	
	private String getStringDettaglio(ArrayList<SoluzioneDiViaggio> l) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Inserisci il numero della soluzione di cui vuoi vedere i dettagli: ");	
		return l.get(scanner.nextInt()).getIdsolution();
	}

}
