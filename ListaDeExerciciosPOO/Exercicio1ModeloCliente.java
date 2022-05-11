package ListaDeExerciciosPOO;

/*1) Crie uma classe cliente e apresente os atributos 
e métodos referentes esta classe, em seguida crie 
um objeto cliente, defina as instancias 
deste objeto e apresente as informações 
deste objeto no console.*/

public class Exercicio1ModeloCliente {
	
	//ATRIBUTOS
	public int dinheiro;
	public boolean paciencia;
	public boolean certeza;
	public boolean confiança;		
	
	//METODO
	
	public void esperar()
	{
		if(this.paciencia==true)
			System.out.println("O cliente está aguardando atendimento.");
		else
			System.out.println("O cliente está impaciente.");
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
		if(this.confiança==true)
			System.out.println("O cliente confia no nosso trabalho!");
		else 
			System.out.println("Precisamos melhorar a confiança com o cliente");
	}
	public void comConfiança()
	{
		this.confiança=true;
	}
	public void semConfiança()
	{
		this.confiança=false;
	}
	public void estadoAtual()
	{
		System.out.println("Dinheiro $"+this.dinheiro);
		System.out.println("O cliente é paciente? "+this.paciencia);
		System.out.println("O cliente tem certeza? "+this.certeza);
		System.out.println("O cliente tem confiança no nosso trabalho? "+this.confiança);
	}
	
	

}
