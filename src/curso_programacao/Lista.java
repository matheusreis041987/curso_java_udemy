package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		
		// Lista com objetos genéricos
		List<Object> list = new ArrayList<Object>();
		
		list.add("Matheus");
		list.add(124);
		list.add(456);
		
		System.out.println(list);
		
		
		List<String> list2 = new ArrayList<>();
		
		list2.add("Maria");
		list2.add("Alex");
		list2.add("Bob");
		list2.add("Anna");
		list2.add(2, "Marco"); // na posição 2 incluir um elemento, os demais são reorganizados
		
		list2.remove("Anna"); // é possível remover um dado a partir da comparação do seu valor com outro valor da lista
		list2.remove(0);
		
		System.out.println(list2.size());
		for (String i: list2) {
			System.out.println(i);
		}
		
		System.out.println("============================================");
		
		list2.removeIf(x -> x.contains("o") == true );    // remover da lista todos que atendam um predicado usando uma função lambda
		
		System.out.println(list2.size());
		for (String i: list2) {
			System.out.println(i);
		}
		
		System.out.println("======================PROCURAR ELEMENTO NA LISTA======================");
		
		list2.add("Aurea");
		list2.add("Bernardo");
		list2.add("Jose");
		System.out.println("Nova lista:");
		System.out.println(list2.size());
		for (String i: list2) {
			System.out.println(i);
		}
		
		System.out.println("Index Aurea: " + list2.indexOf("Aurea"));
		System.out.println("Index Alex: " + list2.indexOf("Alex"));
		
		System.out.println("============================================");
		
		
		//FILTRAR LISTA COM TODOS QUE COMEÇAM COM A
		
		List<String> result = list2.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // tipo stream surgiu a partir do java 8 e aceita expressões lambda
		// o Collector é para converter o stream em lista. Primeiro se converter para usar o lambda (stream) depois se converter para Lista (collect) novamente
		
		for (String i: result) {
			System.out.println(i);
		}
		
		
		System.out.println("============================================");
		//FILTRAR LISTA COM O PRIMNEIRO ELEMENTO QUE COMEÇA COM A LETRA A
		
		String nome = list2.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // tipo stream surgiu a partir do java 8 e aceita expressões lambda
		// o Collector é para converter o stream em lista. Primeiro se converter para usar o lambda (stream) depois se converter para Lista (collect) novamente
		
	System.out.println("Primeiro elemento: "+nome);
	
		
	}

}
