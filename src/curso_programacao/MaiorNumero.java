package curso_programacao;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com 4 números");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();
		double w = sc.nextDouble();
		double maior = 0;
		double[] array = {x,y,z,w};
			for (int i = 0; i < array.length; i++) {
				
				double contagem = Math.max(maior, array[i]);
				maior = contagem;
				
			}
		
		System.out.println("Maior número digitado é " + maior);
		
		sc.close();
	}

}
