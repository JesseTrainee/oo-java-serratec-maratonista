package model;

public class AtletaProfissional extends Maratonista{
	private double peso;
	
	public AtletaProfissional(String nome, String sexo, int idade, double altura,double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}
	@Override
	public String verificaSituacao() {
		return (idade >= 18 && altura >= 1.80 && peso < 100) ? "O atleta est� apto a participar da maratona!" : "O atleta n�o est� apto a participar da maratona!";		
	}
	@Override
	public String toString() {
		return "\nAtleta Profissional Nome: " + nome + 
				"\nSexo: " + sexo +
				"\nIdade: " + idade+
				"\nAltura: " + altura +
				"\nPeso: " + peso ;
	}	
}
