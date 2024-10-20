package curso_programacao;

public class Empregado {

	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public String toString() {
		return  nome + ", $" + String.format("%.2f",salarioLiquido());
	}
	
	
	public void aumentarSalario(double percentual) {
		percentual = percentual / 100;
		salarioBruto = salarioBruto * (1+percentual);
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
}
