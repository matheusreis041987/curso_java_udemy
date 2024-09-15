import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		char letra = '\uu0061';
		int y = 32;
		double s = 45;
		double x = 10.3784865;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("Hello Word");
		System.out.println(letra);
		System.out.print("Bom dia!");
		System.out.println("Bom dia!");
		System.out.println(y);
		System.out.println(x);
		// f é abreviação de formatado %n é uma quebra de linha
		System.out.printf("%.3f%n",x);
		System.out.printf("%.4f%n",x); // printf pega o formato do computador que está rodando, no caso, usando o separador ,
		Locale.setDefault(Locale.US); // alterar o local para o java buscar a localização 
		System.out.printf("%.4f%n",x);
		System.out.printf("%.3f%n", s);
		System.out.println("RESULTADO = " + x + " METROS");
		// concatenar elementos com o printf
		System.out.printf("RESULTADO = %.3f METROS%n",x);
		// representação das variáveis no printf s d f
		System.out.printf("%s tem %d anos e possui uma renda de R$ %.2f%n",nome,idade, renda);
		
		
	}

}
