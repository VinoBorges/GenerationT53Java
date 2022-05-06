package ListaDeExercicios1LaçosDedecisão;
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		
		int contador=2, maior, numero;
		
		System.out.println("Digite o número 1: ");
		numero=ler.nextInt();
		maior=numero;
		
		while(contador <=32) {
			System.out.println("Digite o número " + contador + ":");
			numero=ler.nextInt();
		
     		if(numero < maior) { 
			maior=numero;		
		}
		contador++;
		}
		System.out.println("O numero maior é: "+ maior);
	
	}
}
