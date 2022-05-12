package Herança;

					//PARA REFERENCIAR QUE É "FILHA" USA-SE O "extends"
public class Professor extends Pessoa{
	
	public String modulo;
	public double salario;	
	
	public void aumento(double n)
	{
		this.salario += n;
	}
}
