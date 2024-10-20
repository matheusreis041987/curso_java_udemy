package apllication;

import java.util.Locale;
import java.util.Scanner;

import curso_programacao.Empregado;

public class EmpregadoTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado e1 = new Empregado();
		e1.setNome("Joao Silva");
		e1.setSalarioBruto(6000.0);
		e1.setImposto(1000.0);
		System.out.println("Empregado: " + e1);
		System.out.print("Qual o percentual de incremento salarial?");
		double perc = sc.nextDouble();
		e1.aumentarSalario(perc);
		System.out.println("Dados atualizados: " + e1);
		
		sc.close();
	}

}
