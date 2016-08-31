
public class Maestra {
	
	
	private String Nome;
	private String TipoDanza;
	private String Telefono;

	
	public Maestra(String a, String b, String c)
	{
		Nome=a;
		TipoDanza=b;
		Telefono=c;
				
	}


	public String getNome() {
		return Nome;
	}


	public void setNome(String nome) {
		Nome = nome;
	}


	public String getTipoDanza() {
		return TipoDanza;
	}


	public void setTipoDanza(String tipoDanza) {
		TipoDanza = tipoDanza;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	@Override
	public String toString() {
		return "Maestra [Nome=" + Nome + ", TipoDanza=" + TipoDanza + ", Telefono=" + Telefono + "]";
	}
}
