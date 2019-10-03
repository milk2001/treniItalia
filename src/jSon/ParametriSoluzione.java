package jSon;

public class ParametriSoluzione {
	
	
	
	
	private String stazionePartenza;
	private String stazioneArrivo ;
	private String data;
	private String ora;
	private String adulti;
	private String bambini;
	private boolean freccia;
	private boolean regionali;
	
	
	
	
	@Override
	public String toString() {
		return  stazionePartenza.replaceAll("%20", " ") + "--->" + stazioneArrivo.replaceAll("%20", " ")+"\n"+
				 data + ", " + ora + "\n adulti= " + adulti + "\n bambini= " + bambini + "\n freccia= "
				+ freccia + "\n regionali= " + regionali;
	}
	public String getStazionePartenza() {
		return stazionePartenza;
	}
	public void setStazionePartenza(String stazionePartenza) {
		this.stazionePartenza = stazionePartenza;
	}
	public String getStazioneArrivo() {
		return stazioneArrivo;
	}
	public void setStazioneArrivo(String stazioneArrivo) {
		this.stazioneArrivo = stazioneArrivo;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getOra() {
		return ora;
	}
	public void setOra(String ora) {
		this.ora = ora;
	}
	public String getAdulti() {
		return adulti;
	}
	public void setAdulti(String adulti) {
		this.adulti = adulti;
	}
	public String getBambini() {
		return bambini;
	}
	public void setBambini(String bambini) {
		this.bambini = bambini;
	}
	public boolean isFreccia() {
		return freccia;
	}
	public void setFreccia(boolean freccia) {
		this.freccia = freccia;
	}
	public boolean isRegionali() {
		return regionali;
	}
	public void setRegionali(boolean regionali) {
		this.regionali = regionali;
	}
	
	
	
	

}
