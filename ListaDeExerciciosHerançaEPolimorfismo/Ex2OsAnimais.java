package ListaDeExerciciosHeran�aEPolimorfismo;

public class Ex2OsAnimais  {

	public static void main(String[] args) {
		
		Ex1Cachorro cachorro = new Ex1Cachorro();
		Ex1Cavalo cavalo = new Ex1Cavalo();
		Ex1Pregui�a pregui�a = new Ex1Pregui�a();
		
		System.out.println("Cachorro");
		cachorro.nome="Buck";
		cachorro.idade=5;
		cachorro.sobreOAnimal();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("\nCavalo");
		cavalo.nome="Alas�o";
		cavalo.idade=3;
		cavalo.sobreOAnimal();
		cavalo.correr();
		cavalo.emitirSom();
		
		System.out.println("\nPregui�a");
		pregui�a.nome="Fido";
		pregui�a.idade=7;
		pregui�a.sobreOAnimal();
		pregui�a.subirEmArvore();
		pregui�a.emitirSom();
		
				
		
		
	}

}
