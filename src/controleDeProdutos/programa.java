package controleDeProdutos;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);

		System.out.println("digite a quantidades de produtos para leitura:");
		int n = in.nextInt();
		Produto[] prod = new Produto[n];

		for (int i = 0; i < prod.length; i++) {
			in.nextLine();
			System.out.println("digite o nome e preço do produto: ");
			String nome = in.nextLine();
			float preço = in.nextFloat();
			prod[i] = new Produto(nome, preço);

		}

		in.close();
	}

}
