package ListaDeExerciciosPOO;

/*1) Crie uma classe cliente e apresente os atributos 
e m�todos referentes esta classe, em seguida crie 
um objeto cliente, defina as instancias 
deste objeto e apresente as informa��es 
deste objeto no console.*/

public class Exercicio1ModeloCliente {
	
	//ATRIBUTOS
	public int dinheiro;
	public boolean paciencia;
	public boolean certeza;
	public boolean confian�a;		
	
	//METODO
	
	public void esperar()
	{
		if(this.paciencia==true)
			System.out.println("O cliente est� aguardando atendimento.");
		else
			System.out.println("O cliente est� impaciente.");
	}
	public void comPressa()
	{
		this.paciencia=false;
	}
	public void semPressa()
	{
		this.paciencia=true;
	}
	
	
	public void comCerteza()
	{
		this.certeza=true;
	}
	public void semCerteza()
	{
		this.certeza=false;
	}
	
	public void confiante()
	{
		if(this.confian�a==true)
			System.out.println("O cliente confia no nosso trabalho!");
		else 
			System.out.println("Precisamos melhorar a confian�a com o cliente");
	}
	public void comConfian�a()
	{
		this.confian�a=true;
	}
	public void semConfian�a()
	{
		this.confian�a=false;
	}
	public void estadoAtual()
	{
		System.out.println("Dinheiro $"+this.dinheiro);
		System.out.println("O cliente � paciente? "+this.paciencia);
		System.out.println("O cliente tem certeza? "+this.certeza);
		System.out.println("O cliente tem confian�a no nosso trabalho? "+this.confian�a);
	}
	
	

}
