package IntroduçãoPOO;

public class ModeloCaneta {
	
	//CARACTERISTICAS  -> ATRIBUTOS, possui variáveis, definir os relevantes para tal situação
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

	//MÉTODO CONSTRUTOR -> como quero que seja criado o objeto "padrão"
	//entre parenteses escrever os parâmetros que o metodo recebe, usado dentro do metodo construtor para criar o objeto
	public ModeloCaneta()//se colocar os parâmetros, é obrigado a colocar quando for criar o objeto também
	{				
		this.carga=100;
		this.tampada=true;						
	}
	
	
	
		
	
	//COMPORTAMENTO -> METODOS possui funções, ou seja, sempre com parenteses() e representa as ações; definir os relevantes para tal situação
	
	public void escrever()
	{
		if(this.tampada==true)//this: o objeto quando criado vai verificar
			System.out.println("Erro! A caneta está tampada");
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
		System.out.println("Está tampada? "+this.tampada);
		System.out.println("A carga está em "+this.carga+"%");
	}
	
}
