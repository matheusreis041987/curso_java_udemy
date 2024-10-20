package Util;

import java.util.Locale;
import java.util.Scanner;

public class Cotacao {

	private static final double IOF = 0.06;
	
	
	public static void verCotacao() {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o preço do dolar:");
		double precoDolar = sc.nextDouble();
		System.out.print("Entre com quantidade do dolares:");
		double quantDolar = sc.nextDouble();
		double cotacaoReal = quantDolar * precoDolar * (1+IOF);
		
		System.out.println();
		System.out.println("***********************************");
		System.out.println("Preço dolar: $ " + precoDolar);
		System.out.println("Quantidade dolares: $ " + quantDolar);
		System.out.printf("Valor em Reias: R$ %.2f%n" , cotacaoReal );
		System.out.println("***********************************");
		sc.close();
		
	}
	
}
