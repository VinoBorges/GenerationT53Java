package Repetição;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		
		System.out.print("Digite um número para ser somado: ");
		n=ler.nextInt();
		
		while(n>=0)
		{
/*par*/		if(n%2==0)
				soma=soma+n;
			System.out.print("Digite um número para ser somado: ");
			n=ler.nextInt();
		}
		System.out.println("A soa dos valores pares foi: "+soma);
		
		System.out.println("Escolha uma tabuada do 1 ao 10: ");
		n=ler.nextInt();
		
		while(n>0 && n<=10)
		{
			for(int x=1;x<=10;x++)
				System.out.println(n+ " X "+x+" = "+n*x);
			
				System.out.println("\nEscolha uma tabuada: ");			
				n=ler.nextInt();
			
		}
		System.out.println("Valor inválido, fim do programa!!!");
	}

}
