
public class Allievo {
	
	private String Nome;
	private String Telefono;
	private String Corso;
	private String Eta;
	private String Esperienza;
	
	
	public Allievo(String a)
	{
		Nome = a;
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getCorso() {
		return Corso;
	}


	public void setCorso(String corso) {
		Corso = corso;
	}


	public String getEta() {
		return Eta;
	}


	public void setEta(String età) {
		Eta = età;
	}


	public String getEsperienza() {
		return Esperienza;
	}


	public void setEsperienza(String esperienza) {
		Esperienza = esperienza;
	}


	@Override
	public String toString() {
		return "Allievo [Nome=" + Nome + ", Telefono=" + Telefono + ", Corso=" + Corso + ", Età=" + Eta
				+ ", Esperienza=" + Esperienza + "]";
	}

}
