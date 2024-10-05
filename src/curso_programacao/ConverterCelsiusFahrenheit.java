package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ConverterCelsiusFahrenheit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		char resp = 's';
		Scanner sc = new Scanner(System.in);
		
		do {
			Locale.setDefault(Locale.US);
			System.out.println("Digite a temperatura em Celsius");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n",f);
			System.out.print("Você deseja repeti (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
	
		System.out.println("Programa encerrado!");
		sc.close();

	}

}
