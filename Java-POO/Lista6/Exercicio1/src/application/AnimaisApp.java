package application;

import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class AnimaisApp {
	public static void main(String args []) {
		
		Cachorro dog1 = new Cachorro("Dog",6);
		Cavalo horse1 = new Cavalo("Pocotó",12);
		Preguica sloth1 = new Preguica("Dona Preguiça",99);
		
		System.out.println(horse1.toString());
		System.out.println(horse1.emitirSom());
		System.out.println(horse1.mostrarHabilidade());
		
		System.out.println(dog1.toString());
		System.out.println(dog1.emitirSom());
		System.out.println(dog1.mostrarHabilidade());
		
		System.out.println(sloth1.toString());
		System.out.println(sloth1.emitirSom());
		System.out.println(sloth1.mostrarHabilidade());
	}
}
