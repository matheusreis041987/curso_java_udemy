package Entidade;

public class MaiorArea {

	Area a;
	Area b;
	public MaiorArea (Area a, Area b) {
		this.a = a;
		this.b = b;
		if (a.calcularArea() > b.calcularArea()) {
			System.out.println("Maior triângulo:" + a.t.getNome());
			} else if (a.calcularArea() == b.calcularArea()) {
			System.out.println("Maior triângulo: Os 2 têm o mesmo tamanho") ;
		} else {
			System.out.println("Maior triângulo:" + b.t.getNome());
		}
		
	}
	
	
}
