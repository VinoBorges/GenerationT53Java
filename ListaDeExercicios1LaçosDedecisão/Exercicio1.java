package ListaDeExercicios1La�osDedecis�o;
//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		
		int cont=0, maior=0, numero;
		
		for(int x=1;x<=3;x++) {
			System.out.println("Digite o n�mero " + x + ":");
			numero=ler.nextInt();
		
     		if(numero > maior) { 
			maior=numero;		
		}
		cont++;
		}
		System.out.println("O numero maior �: "+ maior);
	
	}
}
