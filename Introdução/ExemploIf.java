package Introdu��o;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int n1,idade;
		
		System.out.println("Digite um n�mero");
		n1=ler.nextInt();
		
		if(n1%2==0) //se o resto(%) da divis�o for 0 � par
		{	
			System.out.println("par"); //pode deixar sem chaves({}) se s� tiver uma instru��o
		}
		else
		{	
			System.out.println("impar");
		}
		
		System.out.println("Digite sua idade:");
		idade=ler.nextInt();
		
		if(idade>=0 && idade<=13)
			System.out.println("Crian�a");
		else if(idade<13 && idade<=21)
			System.out.println("Adolescente");
		else if(idade<21);
			System.out.println("Adulto");
			
		
	}

}
