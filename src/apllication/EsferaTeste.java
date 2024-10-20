package apllication;

import java.util.Locale;
import java.util.Scanner;

import Util.Calculator;

public class EsferaTeste {


	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		System.out.print("Entre com o valor do raio:");
		double raio = sc.nextDouble();
		
		double c = Calculator.circunferencia(raio);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Circunferência: %.4f%n", c);
		System.out.printf("Volume: %.4f%n", v);
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		sc.close();
		

	}
	


}
