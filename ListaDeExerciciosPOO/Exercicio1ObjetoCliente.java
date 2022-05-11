package ListaDeExerciciosPOO;

/*1) Crie uma classe cliente e apresente os atributos 
e métodos referentes esta classe, em seguida crie 
um objeto cliente, defina as instancias 
deste objeto e apresente as informações 
deste objeto no console.*/


public class Exercicio1ObjetoCliente {

	public static void main(String[] args) {
	
		Exercicio1ModeloCliente clienteIdeal = new Exercicio1ModeloCliente();
						
		System.out.println("\nCliente ideal\n");
		
		clienteIdeal.dinheiro=5000000;
		clienteIdeal.comCerteza();
		clienteIdeal.comConfiança();
		clienteIdeal.semPressa();
		clienteIdeal.esperar();
		clienteIdeal.estadoAtual();
		clienteIdeal.confiante();
		
	
	}
}
