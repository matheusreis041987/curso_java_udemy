package curso_programacao;

import java.util.Scanner;

public class Inserirtexto {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		x = sc.nextInt(); // o Enter acaba dando uma quebra de linha que impacta no próxima execução. No caso, é preciso colocar um nextLine ssozinho
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

	

}
