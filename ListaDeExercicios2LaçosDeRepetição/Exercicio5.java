package ListaDeExercicios2La�osDeRepeti��o;

import java.util.Scanner;

public class Exercicio5 {
	/*5- Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, soma=0;
		do
		{			
			System.out.print("Digite um n�mero: ");
			n=ler.nextInt();		
			soma=soma+n;			
			
					
		}while(n!=0);		
			
		System.out.println("A soma dos valores digitados �: "+soma);
		
	}

}
