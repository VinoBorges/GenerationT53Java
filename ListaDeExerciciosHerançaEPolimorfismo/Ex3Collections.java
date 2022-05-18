package ListaDeExerciciosHerançaEPolimorfismo;

import java.util.ArrayList;
import java.util.Collections;

public class Ex3Collections {

	public static void main(String[] args) {
		
		String produto1  = "Arroz";
		String produto2  = "Feijão";
		String produto3  = "Macarrão";
		String produto4  = "Molho";
		String produto5  = "Queijo";
		String produto6  = "Leite";
		String produto7  = "Papel Higiênico";
		String produto8  = "Sabonete";
		String produto9  = "Desinfetante";
		String produto10 = "Açúcar";

		ArrayList<String> produto = new ArrayList<>();

		// ARMAZENANDO DANOS NA LISTA
		produto.add(produto1) ;
		produto.add(produto2) ;
		produto.add(produto3) ;
		produto.add(produto4) ;
		produto.add(produto5) ;
		produto.add(produto6) ;
		produto.add(produto7) ;
		produto.add(produto8) ;
		produto.add(produto9) ;
		produto.add(produto10);

		
		//APRESENTANDO DADOS DA LISTA
		System.out.println("Lista de produtos:");
		System.out.println(produto);
		System.out.println("");
		
		// ORDENANDO LISTA 

		Collections.sort(produto);
		System.out.println("Itens em ordem alfabética:");
		System.out.println(produto);
		System.out.println("");
		

		// REMOVENDO ÍNDICE 
		
		produto.remove(2);
		System.out.println("Removendo o Desinfetante");			
		System.out.println(produto);
		System.out.println("");
		
		// PROCURANDO ITEM DENTRO DA LISTA 
		
		System.out.println("Procurando o Arroz...");
		if (produto.contains("Arroz"))
			System.out.println("Produto encontrado\n ");
		else
			System.out.println("Produto não encontrado.\n");



	}

}
