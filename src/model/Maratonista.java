package model;

public class Maratonista {
	protected String nome;
	protected String sexo;
	protected int idade;
	protected double altura;
	public Maratonista(String nome, String sexo, int idade, double altura) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.altura = altura;
	}
	public String getNome() {
		return nome;
	}
	public String getSexo() {
		return sexo;
	}
	public int getIdade() {
		return idade;
	}
	public double getAltura() {
		return altura;
	}
	
	public String verificaSituacao() {		
		return (idade >= 18 && altura >= 1.80) ? "O atleta está apto a participar da maratona!" : "O atleta não está apto a participar da maratona!";		
	}
	@Override
	public String toString() {
		return "Maratonista [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", altura=" + altura + "]";
	}
	
}
