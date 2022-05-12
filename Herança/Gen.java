package Herança;

public class Gen {

	public static void main(String[] args) {
		
		Pessoa pe = new Pessoa();
		Professor pr = new Professor();
		Aluno al = new Aluno();
		
		
		pe.idade=10;
		pr.aumento(50.0);
		al.entregarAtividade();

	}
	
}
