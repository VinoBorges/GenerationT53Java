package ListaDeExerciciosHerançaEPolimorfismo;

/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

public class Ex1Cachorro extends Ex1Animal {
	
	public String raça;
	
	public void correr()
	{
		System.out.println(this.nome+ " esta correndo...");
	}
	@Override
	public void emitirSom()
	{
		System.out.println(this.nome+ " está latindo...");
	}
	@Override
	public void sobreOAnimal()
	{
		System.out.println("O nome do cachorro é: "+this.nome);
		System.out.println("A idade do cachorro é: "+this.idade+" ano(s)");
	}
	
}

