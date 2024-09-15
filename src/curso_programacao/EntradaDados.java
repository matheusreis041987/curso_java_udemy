package curso_programacao;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {

		String x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma palavra qualquer:");
		x = sc.next();
		// sysout + ctrl  + espaço
		System.out.println("Você digitou: " + x);

		int y;
		System.out.println("Digite um número inteiro: ");
		y = sc.nextInt();
		System.out.println("Você digitou o número: " + y);

	
		char t;
		System.out.println("Digite uma letra ou texto: ");
		t = sc.next().charAt(0);
		System.out.println("A letra digitada foi: " + t);
		
		
		sc.close();
		
	}

}
