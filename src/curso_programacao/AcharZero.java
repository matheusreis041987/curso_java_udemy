package curso_programacao;

import java.util.Scanner;

public class AcharZero {

	public static void main(String[] args) {
		int valor = -1;
		int valorTotal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SISTEMA PARA A SOMA DE NUMEROS INTEIROS. PARA SAIR, DIGITE ZERO");
		while (valor != 0) {
			
			System.out.println("Digite um número inteiro: ");
			valor = sc.nextInt();
			valorTotal = valorTotal + valor;
			
		}
		sc.close();
		System.out.println("Soma é igual a " + valorTotal);
	}

}
