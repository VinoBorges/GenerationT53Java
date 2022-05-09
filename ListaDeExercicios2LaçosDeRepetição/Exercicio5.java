package ListaDeExercicios2LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio5 {
	/*5- Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		do
		{			
			System.out.print("Digite um número: ");
			n=ler.nextInt();		
			soma=soma+n;			
			
					
		}while(n!=0);		
			
		System.out.println("A soma dos valores digitados é: "+soma);
		
	}

}
