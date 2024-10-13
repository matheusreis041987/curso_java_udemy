package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Area;
import Entidade.MaiorArea;
import Entidade.Triangulo;

public class Programa2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		x.setNome((String)"X");
		y.setNome((String)"Y");
	
		System.out.println("Entre com as medidas do triângulo X:");
		x.setA(sc.nextDouble());
		x.setB(sc.nextDouble());
		x.setC(sc.nextDouble());
		System.out.println("Entre com as medidas do triângulo Y:");
		y.setA(sc.nextDouble());
		y.setB(sc.nextDouble());
		y.setC(sc.nextDouble());
		
		
		Area aX = new Area(x);
		aX.calcularArea();
		aX.imprimirArea();
		Area aY = new Area(y);
		aY.calcularArea();
		aY.imprimirArea();
		
		MaiorArea m = new MaiorArea(aX, aY);
		
		
		sc.close();

	}

}
