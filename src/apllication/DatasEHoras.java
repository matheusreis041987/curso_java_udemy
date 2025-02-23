package apllication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DatasEHoras {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //criando formatos
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); //criando formatos

		LocalDate d01 = LocalDate.now(); // data atual
		LocalDateTime d02 = LocalDateTime.now(); // data e hora atual
		Instant d03 = Instant.now(); // imprime data e hora de Londres
		
		LocalDate d04 = LocalDate.parse("2025-02-21"); // texto no formato ISO 8601 = yyyy-mm-dd; CONVERTER EM DATA
		LocalDateTime d05 = LocalDateTime.parse("2025-02-21T01:30:36"); // texto no formato ISO 8601 = yyyy-mm-ddThh:mm:ss; CONVERTER EM DATA
		Instant d06 = Instant.parse("2025-02-21T01:30:36Z");
		Instant d07 = Instant.parse("2025-02-21T01:30:36-03:00"); // diminuindo 3 horas para trazer para o horário de brasília. É possível subtrair e acrescenter horas
		
		LocalDate d08 = LocalDate.parse("20/07/2023", fmt1); // passar o formato como segundo argumento
		LocalDateTime d09 = LocalDateTime.parse("19/04/1987 02:30", fmt2);
		LocalDate d10 = LocalDate.parse("07/junho/2016", DateTimeFormatter.ofPattern("dd/LLLL/yyyy"));
		
		LocalDate d11 = LocalDate.of(2022, 7, 20);
		LocalDateTime d12 = LocalDateTime.of(2022, 7, 20,15,10,45);// ano + mês + dia + hora + minuto + segundo
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " +d02);		
		System.out.println("d03 = " +d03);	
		System.out.println("d04 = " +d04);
		System.out.println("d05 = " +d05);
		System.out.println("d06 = " +d06);
		System.out.println("d07 = " +d07);
		System.out.println("d08 = " +d08);
		System.out.println("d09 = " +d09);
		System.out.println("d09 = " +d10);
		System.out.println("d09 = " +d11);
		System.out.println("d09 = " +d12);
		System.out.println("*************CONVERTER DATA PARA TEXTO************************************");
		
		LocalDate d13 = LocalDate.parse("2022-07-20");
		LocalDateTime d14 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d15 = Instant.parse("2022-07-20T01:30:26Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // ZoneId.systemDefault() pega o fuso horário do computador/servidor que está rodando a aplicação
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME; // data local sem fuso horário
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;// vai usar por padrão o UTC
		
		System.out.println("d13 = " + d13.format(fmt3)); 
		System.out.println("d13 = " + fmt3.format(d13) );
		System.out.println("d13 = " + d13.format(DateTimeFormatter.ofPattern("dd / MM / yyyy"))); 
		System.out.println("d14 = " + d14.format(fmt3)); // só dia, mês e ano
		System.out.println("d14 = " + d14.format(fmt4)); // completo
		System.out.println("d15: " + fmt5.format(d15));
		System.out.println("d14 = " + d14.format(fmt6));
		System.out.println("d15 = " + fmt7.format(d15));
		System.out.println("******************CONVERTER DATA LOCAL PARA GLOBAL*************************");
		
		LocalDate d16 = LocalDate.parse("2022-07-20");
		LocalDateTime d17 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d18 = Instant.parse("2022-07-20T01:30:26Z");
		
		//for (String s: ZoneId.getAvailableZoneIds()){ // ZoneId.getAvailableZoneIds() --> representa uma coleção de elementos
		//	System.out.println(s); // nome de todos os fuso horários 
		//}
		
		LocalDate r1 = LocalDate.ofInstant(d18, ZoneId.of("Portugal")); // usando uma data global para gerar uma data local considerando a fuso horário da minha máquina 
		System.out.println(r1);
		
	}

}
