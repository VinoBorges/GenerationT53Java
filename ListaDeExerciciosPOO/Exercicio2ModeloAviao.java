package ListaDeExerciciosPOO;

/*2) Crie uma classe avião e apresente os atributos e métodos 
referentes esta classe, em seguida crie um objeto avião, 
defina as instancias deste objeto e apresente as informações 
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
			System.out.println("Esse avião pousa na terra.");
		else
			System.out.println("Esse avião só pousa na água!");
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
			System.out.println("Abasteça o avião para voar!!!");
		else if(this.combustivel>30)
			System.out.println("Avião com combustivel suficiente para voar.");
	}
	public void estadoAtual()
	{
		System.out.println("Quantidade de par de asas: "+this.parDeAsas);
		System.out.println("Possui trem de pouso: "+this.tremDePouso);
		System.out.println("Possui piloto automatico? "+this.pilotoAutomatico);
		System.out.println("Porcentagem de combustível: "+this.combustivel+"%");
		System.out.println("Tipo de avião: "+this.tipo);
	}
	
	
	

	
	
	


}
