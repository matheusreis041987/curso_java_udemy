package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;

public class Programa3 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");	
		produto.setName(sc.nextLine());
		System.out.print("Preço: ");
		produto.setPrice(sc.nextDouble());
		System.out.print("Quantidade: ");
		produto.setQuantity(sc.nextInt());
		
		
		produto.toString();
		
		System.out.println();
		System.out.println("Product data: "+ produto);
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
