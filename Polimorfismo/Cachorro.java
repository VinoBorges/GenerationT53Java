package Polimorfismo;

public class Cachorro extends Pet {

	private String raça;
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
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
}
