package Introdução;

import java.util.Scanner;

public class EntradaESaida {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); //Java não tem um "leia" nativo, tem que fazer essa parada.
		
		int n1,n2;
		
		System.out.println("Digite o primeiro número: ");
		n1=ler.nextInt();
		
		System.out.print("\nDigite o segundo número: ");
		n2=ler.nextInt();
		
		//soma=n1+n2	
		//System.out.println("\nA soma é: "+ soma);
		System.out.println("\nA soma é: " + (n1+n2));
	}
}