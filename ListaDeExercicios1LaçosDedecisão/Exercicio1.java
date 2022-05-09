package ListaDeExercicios1LaçosDedecisão;
//1- Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {		
		Scanner ler = new Scanner(System.in);
		
		
		int cont=0, maior=0, numero;
		
		for(int x=1;x<=3;x++) {
			System.out.println("Digite o número " + x + ":");
			numero=ler.nextInt();
		
     		if(numero > maior) { 
			maior=numero;		
		}
		cont++;
		}
		System.out.println("O numero maior é: "+ maior);
	
	}
}
