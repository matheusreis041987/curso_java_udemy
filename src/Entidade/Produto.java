package Entidade;

import java.util.ArrayList;
import java.util.List;

public  class Produto {
	
	private static List<Produto> lista = new ArrayList<Produto>();

	private String name;
	private double price;
	private int quantity;
	
	
	public Produto (String name, double price, int quantity) {
		
		if(price >= 0 || quantity >= 0) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		} else {
			this.name = name;
			price = 0;
			this.price = price;
			quantity = 0;
			this.quantity = quantity;
		}
		
		lista.add(this);

		
	}
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public double totalValueInStock() {
		
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}

	
	public String toString() {
		
		return 
		 name + ", " + "$ " + String.format("%.2f", price) + ", " 
		+ quantity + " units" + ", Total: $ " 
		+ String.format("%.2f", totalValueInStock()) ;
		
		
	}
	
	public static void imprimirListaProdutos() {
	System.out.println("LISTA DE PRODUTOS:");
	for (Produto i : Produto.lista) {
		System.out.println("Produto: " + i.name + " | Quantidade: " + i.quantity + " | Preço: " + i.price);
		}
		
	}
	
	
	
	
	
}
