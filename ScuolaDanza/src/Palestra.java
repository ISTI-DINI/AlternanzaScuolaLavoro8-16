
public class Palestra {

	private String Nome;
	private String Ubicazione;
	private String Telefono;
	private String Superficie;
	private String Note;
	
	public Palestra(String a)
	{
		Nome=a;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getUbicazione() {
		return Ubicazione;
	}

	public void setUbicazione(String ubicazione) {
		Ubicazione = ubicazione;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getSuperficie() {
		return Superficie;
	}

	public void setSuperficie(String superficie) {
		Superficie = superficie;
	}

	public String getNote() {
		return Note;
	}

	public void setNote(String note) {
		Note = note;
	}

	@Override
	public String toString() {
		return "Palestra [Nome=" + Nome + ", Ubicazione=" + Ubicazione + ", Telefono=" + Telefono + ", Superficie="
				+ Superficie + ", Note=" + Note + "]";
	}
}
