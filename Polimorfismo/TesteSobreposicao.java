package Polimorfismo;

public class TesteSobreposicao {

	public static void main(String[] args) {
		Cachorro lulu = new Cachorro();		
		Papagaio loro = new Papagaio();
				
		System.out.println("CACHORRO");
		lulu.emitirSom();
		lulu.locomover();
		System.out.println("PAPAGAIO");
		loro.emitirSom();
		loro.locomover();
		

	}

}
