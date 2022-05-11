package ListaDeExerciciosPOO;

/*2) Crie uma classe avião e apresente os atributos e métodos 
referentes esta classe, em seguida crie um objeto avião, 
defina as instancias deste objeto e apresente as informações 
deste objeto no console.*/

public class Exercicio2ObjetoAviao {

	public static void main(String[] args) {
		
		Exercicio2ModeloAviao aviao1 = new Exercicio2ModeloAviao();
		
		System.out.println("Avião 1\n");
		aviao1.tipo="Teco-teco";
		aviao1.combustivel=50;
		aviao1.estadoAtual();
		aviao1.pousar();
		aviao1.voar();
		
		

	}

}
