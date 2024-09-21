package curso_programacao;

public class CondicionalTernaria {

	public static void main(String[] args) {
		
		double preco = 34.5;
		double desconto = (preco < 20) ?  preco * 0.1 : preco * 0.05;
		double precoTotal = preco - desconto;
			System.out.printf("Preco Total é de R$ %.2f%n",precoTotal);
	}

}
