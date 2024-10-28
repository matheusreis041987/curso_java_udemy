package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;

public class Product {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

	

		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		System.out.print("Quantidade: ");
		int quantity = sc.nextInt();

		Produto produto = new Produto(name, price, quantity);
		
		produto.toString();

		System.out.println();
		System.out.println("Product data: " + produto);
		System.out.println();
		System.out.print("Entre com o número de produtos a ser adicionado ao estoque:");
		int quantidade = sc.nextInt();
		produto.addProducts(quantidade);
		System.out.println("Update data: " + produto);
		System.out.print("Entre com o número de produtos a ser retirados do estoque:");
		quantidade = sc.nextInt();
		produto.removeProduct(quantidade);
		System.out.println("Update data: " + produto);

		sc.close();
		
		
	}

}
