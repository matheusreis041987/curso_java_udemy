package curso_programacao;

import java.util.ArrayList;
import java.util.Scanner;

public class MaiorNumero2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 números:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int maior =  max(a,b,c);
		mostrarResultado(maior);
		
	}
	
	
	public static int max (int x, int y, int z) {
		
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(x);
		lista.add(y);
		lista.add(z);
		int maior = 0;
			for (int i = 0; i < lista.size(); i++) {
				int funMaior = Math.max(maior, lista.get(i));
				maior = funMaior;
			}
		
		return maior;
	}
	
	public static void mostrarResultado(int maior) {
		
		System.out.println("O maior valor é: " + maior);
		
	}

}
