package ListaDeExercicios2LaçosDeRepetição;

import java.util.Scanner;

public class Exercicio3 {
	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99. (WHILE)*/
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade, menosVinteEUm=0, maisCinquenta=0; 
		
		System.out.print("Digite sua idade: ");
		idade=ler.nextInt();
		
		while(idade != -99)
		{
			System.out.print("Digite sua idade: ");
			idade=ler.nextInt();
			
			if(idade<21)
			{
				menosVinteEUm++;
			}
			if(idade>50)
			{
				maisCinquenta++;
			}
												
		}
		System.out.println("O total de pessoas com menos de 21 anos é: "+menosVinteEUm);
		System.out.println("O total de pessoas com mais de 50 anos é: "+maisCinquenta);

	}

}
