package curso_programacao;

public class trabalhandoComString {

	public static void main(String[] args) {
		
		String original = "-asdfaksdasldk oalisn djasçdkl l     lkjin as	DDDDDDDDD DD-                      ";
			
		String s1 = original.toLowerCase();
		System.out.println("toLowerCase: "+s1); // tranforma tudo em minúsculo
		String s2 = original.toUpperCase();
		System.out.println("toUpperCase: "+s2); // transforma em maiúscula
		String s3 = original.trim(); // retirar espaços no início e fim
		System.out.println("Trim: " + s3);
		String s4 = original.substring(2); // vai só mostrar do carcter 2 em diante
		System.out.println("Substring: " + s4);
		String s5 = original.substring(2,10); // mostra o caracter de início e fim
		System.out.println("Substring2 : " + s5);
		String s6 = original.replace("a", "1"); // substituir uma letra do texto
		System.out.println("Replace: " + s6);
		String v7 = original.replace("asd", "AAAAAAA");
		System.out.println("replace2: " + v7);	
		int v8 = original.indexOf("as"); // primeira ocorrência da String
		int v9 = original.lastIndexOf("as"); // última posição encontrada
		System.out.println("Primeira posição: " + v8);
		System.out.println("ùltima posição: " + v9);
		
		System.out.println("");
		System.out.println("******************************FUNÇÃO SPLIT*******************************************************");
		
		String s = "batata maça limão uva melao banana";
		String[] vect = s.split(" ");
	
			for (int i = 0; i < vect.length; i++) {
				System.out.println(vect[i]);
			}
	
		String urc = "SUNGD,SUNNG,SUNFT,SUNRF,SUNCF,SUNES";
		String[] vetor = urc.split(",");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
			
		System.out.println("");
		System.out.println("====================================================================================");

		String nomeCompleto = "Matheus Reis Costa";
		int posição = nomeCompleto.indexOf(" "); // posição do espaço no nome
		System.out.println("Posição espaço: " + posição);
		int quantidade = nomeCompleto.length();
		System.out.println("quantidade de caracteres: " + quantidade);
		String nome = nomeCompleto.substring(0, nomeCompleto.indexOf(" ")).trim();
		System.out.println("Nome Completo: " + nomeCompleto);
		System.out.println("Primeiro nome: " + nome);
		String sobrenome = nomeCompleto.substring(posição, quantidade).trim();
		System.out.println("Sobrenome: " + sobrenome);
		
	}
	
}
