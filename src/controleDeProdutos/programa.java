package controleDeProdutos;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		int n=0;
		Produto[] prod = new Produto[n];
		
		System.out.println("digite a quantidades de produtos para leitura:");
		n = in.nextInt();
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println("digite o nome e preço do produto: ");
			
			
		}
		
		in.close();
	}

}
