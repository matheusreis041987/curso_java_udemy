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
		
		
		System.out.println(produto.getName() + " ; " + produto.getPrice() + " ; " + produto.getQuantity());
		
		sc.close();
		
		
	}

}
