package ListaDeExercicios2La�osDeRepeti��o;

import java.util.Scanner;

public class Exercicio2 {
/*2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, contPar=0, contImpar=0;
							
		for(int x=1;x<=10;x++)
		{
			System.out.print("Digite o "+ x + "� n�mero: ");
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
		System.out.println("A quantidade de n�meros pares �: "+contPar);
		System.out.println("A quantidade de n�meros impares �: "+contImpar);
										
				
	}

}
