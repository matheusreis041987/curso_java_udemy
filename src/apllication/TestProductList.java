package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidade.Produto;

public class TestProductList {

	public static void main(String[] args) {

		Produto p1 = new Produto("Tv",200.12,10);
		Produto p2 = new Produto("Microondas",50.12,5);
		Produto p3 = new Produto("máquina de lavar",30,12);

		Produto.imprimirListaProdutos();
	}

}
