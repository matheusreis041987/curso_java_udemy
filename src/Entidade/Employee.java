package Entidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	
	private static List<Employee> list = new ArrayList<>();
	
	public Employee(Integer id, String name, Double salary) {
		
		this.id = id;
		this.name = name;
		this.salary = salary;
		list.add(this);
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, list, name, salary);
	}

	
	public boolean equals(Employee e) {

		if (e.name == this.name && e.id == this.id ) {
			return true;
		} else
			return false;
		
	}

	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary +"]";
	}
	
	public static void increaseSalary(Integer idIncrease, Double percent) {
					
		for (Employee en : list) {
			if (idIncrease == en.id) {
				en.salary = en.salary * (1 + percent);
			} else {
				System.out.println("Id not found");
			}
		}
		
	}
	
	public static void listEmployee() {
		
		for (Employee en : list) {
			System.out.println("id: " + en.id + ", name: " + en.name + ", salary: $" + en.salary);
		}
		
	}
	
	
	
	
	
}
