package Introdu��oPOO;

public class ModeloCaneta {
	
	//CARACTERISTICAS  -> ATRIBUTOS, possui vari�veis, definir os relevantes para tal situa��o
	private String cor;
	private double ponta;
	private int carga;
	private boolean tampada;
	
	//METODOS ACESSORES(gets) e MODIFICADORES(sets)
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getPonta() {
		return ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	//M�TODO CONSTRUTOR -> como quero que seja criado o objeto "padr�o"
	//entre parenteses escrever os par�metros que o metodo recebe, usado dentro do metodo construtor para criar o objeto
	public ModeloCaneta()//se colocar os par�metros, � obrigado a colocar quando for criar o objeto tamb�m
	{				
		this.carga=100;
		this.tampada=true;						
	}
	
	
	
		
	
	//COMPORTAMENTO -> METODOS possui fun��es, ou seja, sempre com parenteses() e representa as a��es; definir os relevantes para tal situa��o
	
	public void escrever()
	{
		if(this.tampada==true)//this: o objeto quando criado vai verificar
			System.out.println("Erro! A caneta est� tampada");
		else
			System.out.println("Escrevendo...");					
	}
	
	public void tampar()
	{
		this.tampada=true;
	}
	
	public void destampar()
	{
		this.tampada=false;
	}
	public void estadoAtual()
	{
		System.out.println("cor: "+this.cor);
		System.out.println("ponta: "+this.ponta);
		System.out.println("Est� tampada? "+this.tampada);
		System.out.println("A carga est� em "+this.carga+"%");
	}
	
}
