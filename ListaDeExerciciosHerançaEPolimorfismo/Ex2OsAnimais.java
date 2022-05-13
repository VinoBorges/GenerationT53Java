package ListaDeExerciciosHerançaEPolimorfismo;

public class Ex2OsAnimais  {

	public static void main(String[] args) {
		
		Ex1Cachorro cachorro = new Ex1Cachorro();
		Ex1Cavalo cavalo = new Ex1Cavalo();
		Ex1Preguiça preguiça = new Ex1Preguiça();
		
		System.out.println("Cachorro");
		cachorro.nome="Buck";
		cachorro.idade=5;
		cachorro.sobreOAnimal();
		cachorro.correr();
		cachorro.emitirSom();
		
		System.out.println("\nCavalo");
		cavalo.nome="Alasão";
		cavalo.idade=3;
		cavalo.sobreOAnimal();
		cavalo.correr();
		cavalo.emitirSom();
		
		System.out.println("\nPreguiça");
		preguiça.nome="Fido";
		preguiça.idade=7;
		preguiça.sobreOAnimal();
		preguiça.subirEmArvore();
		preguiça.emitirSom();
		
				
		
		
	}

}
