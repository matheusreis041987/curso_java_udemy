package curso_programacao;

import java.util.Scanner;

public class contagem_regressiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número iniical");
		
		int n = sc.nextInt();
		
		for (int i = n; i>=0;i = i-1) {
			System.out.println(i);
			
		}
		

	}

}
