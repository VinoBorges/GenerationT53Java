package Polimorfismo;

public abstract class Pet {//classe abstrata � uma classe que n�o pode gerar objetos, s� gera outros moldes

	private double peso;
	private String nome;
	
	public void locomover()
	{
		System.out.println("mudando de posi��o...");
	}
	
	public void emitirSom()
	{
		System.out.println("Som de Pet");
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
