package IntroduçãoPOO;

public class Caneta {

	public static void main(String[] args) {
		
		ModeloCaneta caneta1 = new ModeloCaneta();		
		
		System.out.println("Caneta 1");
		
		caneta1.carga=99;
		caneta1.tampar();
		caneta1.destampar();
		
		caneta1.escrever();
		
		caneta1.estadoAtual();
				

	}

}
