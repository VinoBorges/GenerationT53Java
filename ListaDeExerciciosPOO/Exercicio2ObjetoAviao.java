package ListaDeExerciciosPOO;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos 
referentes esta classe, em seguida crie um objeto avi�o, 
defina as instancias deste objeto e apresente as informa��es 
deste objeto no console.*/

public class Exercicio2ObjetoAviao {

	public static void main(String[] args) {
		
		Exercicio2ModeloAviao aviao1 = new Exercicio2ModeloAviao();
		
		System.out.println("Avi�o 1\n");
		aviao1.tipo="Teco-teco";
		aviao1.combustivel=50;
		aviao1.estadoAtual();
		aviao1.pousar();
		aviao1.voar();
		
		

	}

}
