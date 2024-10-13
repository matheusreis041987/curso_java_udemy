package Entidade;

import java.util.Locale;

public class Area {
	

	Triangulo t;
	public Area(Triangulo t) {
		this.t = t;
	}
	
	public double calcularArea() {
		
		double p = (t.getA() + t.getB() + t.getC()) / 2.0;
		double area = Math.sqrt(p * (p - t.getA()) * (p - t.getB()) * (p - t.getC()));
		
		return area;
	}
	
	public void imprimirArea() {
		System.out.printf("A área do triângulo %s é %.4f%n",t.getNome(),calcularArea() );
	}
}
