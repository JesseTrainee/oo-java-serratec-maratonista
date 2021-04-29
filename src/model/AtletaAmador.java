package model;

public class AtletaAmador extends Maratonista{
	private boolean atestado;
	
	public AtletaAmador(String nome, String sexo, int idade, double altura, boolean atestado) {
		super(nome, sexo, idade, altura);
		this.atestado = atestado;
	}
	@Override
	public String verificaSituacao() {
		return (idade >= 18 && altura >= 1.80 && atestado == false) ? "O atleta está apto a participar da maratona!" : "O atleta não está apto a participar da maratona!";		
	}

	@Override
	public String toString() {
		return "\nAtleta Amador Nome: " + nome + 
				"\nSexo:" + sexo + 
				"\nIdade:" + idade+ 
				"\nAltura:" + altura;
	}
	
	
	
}
