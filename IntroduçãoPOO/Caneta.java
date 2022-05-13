package IntroduçãoPOO;

public class Caneta {

	public static void main(String[] args) {
		
		ModeloCaneta caneta1 = new ModeloCaneta();		
		ModeloCaneta caneta2 = new ModeloCaneta();
		ModeloCaneta caneta3 = new ModeloCaneta();
		
		
		caneta1.setCor("Vermelho");
		System.out.println(caneta1.getCor());//para ver a informação no console
		
		caneta1.setPonta(0.8);
		
		caneta1.estadoAtual();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("Caneta 1"); antes do get e set
		caneta1.carga=99;
		caneta1.tampar();
		caneta1.destampar();
		caneta1.escrever();
		caneta1.estadoAtual();*/
				

	}

}
