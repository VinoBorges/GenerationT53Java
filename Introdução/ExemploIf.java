package Introdução;

import java.util.Scanner;

public class ExemploIf {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int n1,idade;
		
		System.out.println("Digite um número");
		n1=ler.nextInt();
		
		if(n1%2==0) //se o resto(%) da divisão for 0 é par
		{	
			System.out.println("par"); //pode deixar sem chaves({}) se só tiver uma instrução
		}
		else
		{	
			System.out.println("impar");
		}
		
		System.out.println("Digite sua idade:");
		idade=ler.nextInt();
		
		if(idade>=0 && idade<=13)
			System.out.println("Criança");
		else if(idade<13 && idade<=21)
			System.out.println("Adolescente");
		else if(idade<21);
			System.out.println("Adulto");
			
		
	}

}
