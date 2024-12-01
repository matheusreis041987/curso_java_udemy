package curso_programacao;

public class ForEach {

	public static void main(String[] args) {
		/*
		 ESTRUTURA DO FOR EACH
		  for ( <tipo> <apelido>: <coleção/vetor>) {
		  <comando 1>
		  <comando 2>
		  
		  }
		 */
		
		String[] vect = new String [] {"Maria", "Bob", "Alex"};
		
		for (String i: vect) {
			
			System.out.println(i);
			System.out.println(i.length());
			
		}
		

	}

}
