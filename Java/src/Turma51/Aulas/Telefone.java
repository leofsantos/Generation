package Turma51.Aulas;

public abstract class Telefone {
	
	//it will be our superclass
	//and also our abstract class
	//attributes
	
	private String tipo;
	
	public Telefone(String tipo)
	{
		this.tipo = tipo;
	}
	
	//creating an abstract method
	
	abstract public void disca(String numero);
	abstract public void toca(int numToques);

	//creating getters and setters
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
}
