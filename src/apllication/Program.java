package apllication;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double xA, xB, xC, yA, yB, yC;
		Scanner  sc = new Scanner(System.in);
	
		
		System.out.println("Entre com as medidas do triângulo X: ");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Entre com as medidas do triângulo Y: ");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double pA = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(pA * (pA - xA) * (pA - xB) * (pA - xC)); 
		
		double pY = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC)); 
		
		System.out.printf("Área do triângulo X: %.4f%n", areaX);
		System.out.printf("Área do triângulo X: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Maior área: X");
		}else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();
		
		
	}

}
