package Heran�a;

					//PARA REFERENCIAR QUE � "FILHA" USA-SE O "extends"
public class Professor extends Pessoa{
	
	public String modulo;
	public double salario;	
	
	public void aumento(double n)
	{
		this.salario += n;
	}
}
