package ListaDeExercicios1LaçosDedecisão;

import java.util.Scanner;

public class Exercicio2 {
	/*2 Faça um programa que entre com três números e coloque em ordem crescente.*/

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.print("Digite um númeo: ");
		n1=ler.nextInt();
		System.out.print("Digite um númeo: ");
		n2=ler.nextInt();
		System.out.print("Digite um númeo: ");
		n3=ler.nextInt();
		
		if((n1<n2) && (n2<n3))
		{
			System.out.println("A ordem crescente dos números é: "+n1+" "+n2+" "+n3);
		}
		else if((n1<n3) && (n3<n2))
		{
			System.out.println("A ordem crescente dos números é: "+n1+" "+n3+" "+n2);
		}
		else if((n2<n1) && (n1<n3))
		{
			System.out.println("A ordem crescente dos números é: "+n2+" "+n1+" "+n3);
		}
		else if((n2<n3) && (n3<n1))
		{
			System.out.println("A ordem crescente dos números é: "+n2+" "+n3+" "+n1);
		}
		else if((n3<n1) && (n1<n2))
		{
			System.out.println("A ordem crescente dos números é: "+n3+" "+n1+" "+n2);
		}
		else if((n3<n2) && (n2<n1))
		{
			System.out.println("A ordem crescente dos números é: "+n3+" "+n2+" "+n1);
		}				
	}

}
