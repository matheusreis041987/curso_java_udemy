package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Employee;

public class TestEmplyoee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many emplyoee will be registered? ");
		int quantity = sc.nextInt();
		Employee emp;
		
		for (int i = 0; i < quantity; i++ ) {
		
		System.out.println("Emplyoee #" + (i + 1));
		String linha = sc.nextLine();
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Id: ");
		int id = sc.nextInt();
		
		
		System.out.print("Salary: ");
		double salary = sc.nextDouble();
		
		emp = new Employee(id, name, salary);
		

	}
		
	System.out.println(" ");
	System.out.print("Enter the employee id that will have salary increase: ");
	int idIncrease = sc.nextInt();
	System.out.print("Emter the percentage: ");
	double percentage = sc.nextDouble();
	
	Employee.increaseSalary(idIncrease, percentage);
	
	Employee.listEmployee();
		
		
		
		
	}
}
