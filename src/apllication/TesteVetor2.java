package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;

public class TesteVetor2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Indique a quanntidade de produtos: ");
		int n = sc.nextInt();
		double sum = 0;
		Produto[] vect = new Produto[n];
	
		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do produto " + (i+1) +": "  );
			String name = sc.nextLine();
			System.out.print("Digite o valor do produto " + (i+1) +": " );
			double price = sc.nextDouble();
			vect[i] = new Produto(name, price);
			sum = sum + vect[i].getPrice(); 
		}
		double avg = sum / n;
		System.out.printf("A média dos preços é: %.2f%n", avg );
		
		sc.close();
	}

}
