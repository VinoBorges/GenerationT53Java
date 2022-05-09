package ListaDeExercicios2LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio2 {
/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, contPar=0, contImpar=0;
							
		for(int x=1;x<=10;x++)
		{
			System.out.print("Digite o "+ x + "º número: ");
			n=ler.nextInt();
			if(n % 2==0)
			{
				contPar++;
			}
			if(n % 2==1)
			{
				contImpar++;
			}
				
		}
		System.out.println("A quantidade de números pares é: "+contPar);
		System.out.println("A quantidade de números impares é: "+contImpar);
										
				
	}

}
