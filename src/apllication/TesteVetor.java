package apllication;

import java.util.Locale;
import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("digite o tamanho do vetor:  ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double total = 0;	

		for (int i= 0; i < n; i++) {
			System.out.print("Digite a altura " + (i+1)+ ": ");	
			vect[i] = sc.nextDouble();
			total = total + vect[i] ;
		}
		
		
		double media = total / n;
		System.out.printf("A média das alturas é: %.2f%n" , media);
		sc.close();
		
	}

}
