package curso_programacao;

import java.util.Scanner;

public class SomarNumeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de número da soma:");
		int n = sc.nextInt();		
		int soma = 0;
		for (int i=0;i<n;i++) {
			System.out.println("Digite o número " + (i+1));
			int x = sc.nextInt();
			soma = soma + x;
		}
			System.out.println("A soma é: " + soma);
			
	}

}
