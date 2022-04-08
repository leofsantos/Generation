package entities;

public class Preguica extends Animal {

	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public String emitirSom() {
		return "Som emitido: Zzzzz";
	}
	@Override
	public String mostrarHabilidade() {
		return "Habilidade: Escalar árvores";
	}
}
