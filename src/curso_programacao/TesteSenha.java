package curso_programacao;

import java.util.Scanner;

public class TesteSenha {

	public static void main(String[] args) {
		int senha = 1234;
		
		System.out.println("Digite sua senha com 4 dígitos:");
		Scanner sc = new Scanner(System.in);
		int senhaDigitada = sc.nextInt();
		int contador = 0;
		while (senha != senhaDigitada && contador != 3) {
			System.out.println("Senha incorreta. Digite novamente a senha: ");
			senhaDigitada = sc.nextInt();
			contador += 1;
		}
			if (senha != senhaDigitada) {
				System.out.println("Senha digitada incorreta mais de 4 vezes. Usuário bloqueado temporariamente");
				sc.close();
			} else {
				System.out.println("Senha correta. Pode acessar o sistema");
			}
		
	}

}
