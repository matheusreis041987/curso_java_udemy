package curso_programacao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVWriter;

public class GerandoCsv {

	private static final String CSV_PATH = "C:\\Users\\Matheus\\Documents\\D\\gerandocsv.csv";
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Iniciando a geração de CSV");
		
		try {
			FileWriter fw = new FileWriter(new File(CSV_PATH));
			CSVWriter cw = new CSVWriter(fw);
			
			String[] headers = {"nome", "email","telefome"};
			List<String[]> data = new ArrayList<String[]>();
			
			String[] item1 = {"Everton Batista de Souza", "everton.souza@serpro.gov.br", "(61) 2021-7080"};
			String[] item2 = {"Danilo Kropf Mendes", "danilo.mendes@serpro.gov.br", "(21) 99127-6057"};
			String[] item3 = {"Danilo Kropf Mendes", "danilo.mendes@serpro.gov.br", "(21) 99127-6057"};
			String[] item4 = {"Jose Geraldo Ferreira", "jose-geraldo.ferreira@serpro.gov.br", "(31) 3311-6395"};
			String[] item5 = {"Lucy Fernandes Ramos", "lucy.ramos@serpro.gov.br", "(21) 2159-3392"};
			
			data.add(headers);
			data.add(item1);
			data.add(item2);
			data.add(item3);
			data.add(item4);
			data.add(item5);
			cw.writeAll(data);
			
			cw.close();
			fw.close();
			
			
			System.out.println("Escrita de arquivo finalizado");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		

		

	}

}
