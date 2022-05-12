package Herança;
//PARA REFERENCIAR QUE É "FILHA" USA-SE O "extends"
public class Aluno extends Pessoa{

	public int matricula;
	public String curso;
	
	public void entregarAtividade()
	{
		System.out.println("Atividade entregue");
	}
	
}
