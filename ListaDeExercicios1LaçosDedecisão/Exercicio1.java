package ListaDeExercicios1La�osDedecis�o;
//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		
		int contador=2, maior, numero;
		
		System.out.println("Digite o n�mero 1: ");
		numero=ler.nextInt();
		maior=numero;
		
		while(contador <=32) {
			System.out.println("Digite o n�mero " + contador + ":");
			numero=ler.nextInt();
		
     		if(numero < maior) { 
			maior=numero;		
		}
		contador++;
		}
		System.out.println("O numero maior �: "+ maior);
	
	}
}
