package application;

import model.AtletaAmador;
import model.AtletaProfissional;
import model.Maratonista;

public class Program {
	public static void main(String[] args) {
		Maratonista mAmador = new AtletaAmador("João", "M", 27, 1.90, false);
		Maratonista mProfissional = new AtletaProfissional("Maria" , "F" , 17 , 1.90,87);
		
		System.out.println(mAmador);
		System.out.println(mAmador.verificaSituacao());
		System.out.println(mProfissional);
		System.out.println(mProfissional.verificaSituacao());
		
	}
}
