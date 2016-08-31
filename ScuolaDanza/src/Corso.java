import java.util.ArrayList;
import java.util.List;

public class Corso {
	
	private String Nome;
	private String Durata;
	private Maestra Insegnante;
	private Palestra Pal;
	private List<Allievo> Allievi;

	public Corso(String a)
	{
		Nome=a;
		Allievi=new ArrayList<Allievo>();
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDurata() {
		return Durata;
	}

	public void setDurata(String durata) {
		Durata = durata;
	}

	public Maestra getInsegnante() {
		return Insegnante;
	}

	public void setInsegnante(Maestra insegnante) {
		Insegnante = insegnante;
	}

	public Palestra getPal() {
		return Pal;
	}

	public void setPal(Palestra pal) {
		Pal = pal;
	}

	public List<Allievo> getAllievi() {
		return Allievi;
	}

	public void addAllievo(Allievo alliev) {
		Allievi.add(alliev);
	}

	@Override
	public String toString() {
		return "Corso [Nome=" + Nome + ", Durata=" + Durata + ", Insegnante=" + Insegnante + ", Pal=" + Pal
				+ ", Allievi=" + Allievi + "]";
	}
}
