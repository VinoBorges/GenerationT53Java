package Introdu��o;

import java.util.Scanner;

public class EntradaESaida {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); //Java n�o tem um "leia" nativo, tem que fazer essa parada.
		
		int n1,n2;
		
		System.out.println("Digite o primeiro n�mero: ");
		n1=ler.nextInt();
		
		System.out.print("\nDigite o segundo n�mero: ");
		n2=ler.nextInt();
		
		//soma=n1+n2	
		//System.out.println("\nA soma �: "+ soma);
		System.out.println("\nA soma �: " + (n1+n2));
	}
}