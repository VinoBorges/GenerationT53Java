package ListaDeExerciciosHeran�aEPolimorfismo;

/*1- Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
Animal:*/

public class Ex1Pregui�a extends Ex1Animal{

	public void subirEmArvore()
	{
		System.out.println(this.nome + " est� subindo na �rvore...");
	}
	@Override
	public void emitirSom()
	{
		System.out.println(this.nome + " est� se espregui�ando...");
	}	
	@Override
	public void sobreOAnimal()
	{
		System.out.println("O nome da pregui�a �: "+this.nome);
		System.out.println("A idade da pregui�a �: "+this.idade+" ano(s)");
	}
}
