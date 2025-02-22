package apllication;

import java.util.Scanner;

public class matriz {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o número n da matriz:");
		int n = sc.nextInt();
		
		//arranjo bidimencional - TABELA
		// para um arranjo bidimencional, é só usar 2 clochetes. Para 3 , usar 3 colchetes
		
		int [][] mat = new int[n][n];
		
		// numa matriz bi dimencional, teremos de fazer um for. O primeiro para ler as linhas, o segundo, as colunas
		
		for (int i = 0; i < mat.length; i++) { // percorrer as linhas
			System.out.println("você está na linha " + i + ".");
			for (int j = 0; j < mat[i].length; j++) { // percorrer as colunas
				System.out.print("Digite o número da linha " + i + " , coluna " + j + ": ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("diagonal principal:");
		for (int i = 0; i< mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println(" ");
		
		// encontrar quantidade de números negativos
		int count = 0;
		for (int i = 0; i < mat.length; i++) {// percorrer linhas
			for (int j = 0; j < mat[i].length; j++) {// percorrer as colunas
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("quantidade de números negativos: " + count);
		
		
		
		sc.close();

	}

}
