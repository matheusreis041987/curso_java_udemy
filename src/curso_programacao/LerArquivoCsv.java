package curso_programacao;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LerArquivoCsv {

	private static final String CSV_PATH = "C:\\Users\\Matheus\\Documents\\D\\gerandocsv.csv";
	
	public static void main(String[] args) {
		
		try {
			CSVReader csvReader = new CSVReader(new FileReader(new File(CSV_PATH)));
			
			List<List<String>> linhas = new ArrayList<List<String>>();
			
			String[] colunas = null;
			
			while ((colunas = csvReader.readNext()) != null) {
				linhas.add(Arrays.asList(colunas));
			}
			
			linhas.forEach(cols -> {
				System.out.println(cols);
			});
			
		}catch (Exception e) {
			e.getStackTrace();
		}
		
				

	}

}
