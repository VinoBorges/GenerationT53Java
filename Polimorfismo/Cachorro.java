package Polimorfismo;

public class Cachorro extends Pet {

	private String ra�a;
	private String cor;
	
	@Override
	public void locomover()
	{
		System.out.println("Correndo...");
	}
	@Override
	public void emitirSom()
	{
		System.out.println("Latir");
	}
	public String getRa�a() {
		return ra�a;
	}

	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
