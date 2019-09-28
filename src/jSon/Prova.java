package jSon;
  
import java.io.IOException;

public class Prova {
	public static void main(String[] args) {

		Interfaccia i = new Interfaccia();
		try {
			i.avvia();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
