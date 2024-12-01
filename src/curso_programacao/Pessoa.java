package curso_programacao;

public class Pessoa {

	private String nome;
	
	public Pessoa (String nome) {
		this.nome = nome;
		System.out.println("nova pessoa criada");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
