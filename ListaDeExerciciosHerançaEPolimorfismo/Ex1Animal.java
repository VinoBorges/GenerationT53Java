package ListaDeExerciciosHeran�aEPolimorfismo;
/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/


public class Ex1Animal {

	public String nome;
	public int idade;
	public String somDoAnimal;
	
	public void emitirSom()
	{
		System.out.println("O animal est� emitindo som ");
	}	
	
	public void sobreOAnimal()
	{
		System.out.println("O nome do animal �: "+this.nome);
		System.out.println("A idade do animal �: "+this.idade);
	}
}
