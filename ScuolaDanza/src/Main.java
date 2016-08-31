import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Corso> listacorsi = new ArrayList<Corso>(); 
		List<Allievo> listaallievi = new ArrayList<Allievo>();
		List<Maestra> listamaestre = new ArrayList<Maestra>();
		
		Palestra P1 = new Palestra("Danza con me");
		P1.setUbicazione("Via Aurelia");
		P1.setSuperficie("50 mq");
		
		Palestra P2 = new Palestra("Ghezzi");
		P2.setUbicazione("Via Diotisalvi");
		P2.setSuperficie("50 mq");
		
		Maestra M1 = new Maestra("Martina", "Classica", "333");
		Maestra M2 = new Maestra("Veronica", "Moderna", "334");
		
		Allievo A1 = new Allievo("Franco");
		A1.setEta("20");
		Allievo A2 = new Allievo("Nicole");
		A2.setEta("17");
		Allievo A3 = new Allievo("Niccolò");
		A3.setEta("16");
		Allievo A4 = new Allievo("Giorgio");
		A4.setEta("20");
		
		
		Corso C1 = new Corso("Classica intermedia");
		C1.setDurata("3 mesi");
		C1.setInsegnante(M2);
		C1.setPal(P2);
		C1.addAllievo(A3);
		C1.addAllievo(A4);
		
		Corso C2 = new Corso("Moderna Avanzata");
		C2.setDurata("3 mesi");
		C2.setInsegnante(M1);
		C2.setPal(P1);
		C2.addAllievo(A2);
		C2.addAllievo(A1);
		
		System.out.println(C1);
		System.out.println(C2);
		
	}
}
