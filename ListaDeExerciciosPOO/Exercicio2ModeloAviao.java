package ListaDeExerciciosPOO;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos 
referentes esta classe, em seguida crie um objeto avi�o, 
defina as instancias deste objeto e apresente as informa��es 
deste objeto no console.*/

public class Exercicio2ModeloAviao {

//ATRIBUTOS
	int parDeAsas;
	boolean tremDePouso;
	boolean pilotoAutomatico;
	int combustivel;
	String tipo;
	
	//METODOS
	public Exercicio2ModeloAviao()
	{
		this.parDeAsas=2;
		this.tremDePouso=false;
		this.pilotoAutomatico=false;
	}
	
	public void pousar()
	{
		if(this.tremDePouso==true)
			System.out.println("Esse avi�o pousa na terra.");
		else
			System.out.println("Esse avi�o s� pousa na �gua!");
	}
	public void comTremDePouso()
	{
		this.tremDePouso=true;
	}
	public void semTremDePouso()
	{
		this.tremDePouso=false;
	}
	
	public void voar()
	{
		if(this.combustivel<=30)
			System.out.println("Abaste�a o avi�o para voar!!!");
		else if(this.combustivel>30)
			System.out.println("Avi�o com combustivel suficiente para voar.");
	}
	public void estadoAtual()
	{
		System.out.println("Quantidade de par de asas: "+this.parDeAsas);
		System.out.println("Possui trem de pouso: "+this.tremDePouso);
		System.out.println("Possui piloto automatico? "+this.pilotoAutomatico);
		System.out.println("Porcentagem de combust�vel: "+this.combustivel+"%");
		System.out.println("Tipo de avi�o: "+this.tipo);
	}
	
	
	

	
	
	


}
