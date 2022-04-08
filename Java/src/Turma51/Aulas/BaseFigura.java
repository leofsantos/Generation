package Turma51.Aulas;

public class BaseFigura {
	
	//attributes
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse;
	
	//constructor
	BaseFigura(double lado1,double lado2, String nome)
	{
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}
	
	//getters and setters
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	//extra methods
	
	public double getArea()
	{
		//its on our interface, but we have to describe it
		return lado1*lado2;
	}
	
	public double getPerimetro()
	{
		//it is also on our interface, but have not been described yet
		return (lado1+lado2)*2.0;
	}
	public String getNome()
	{
		return nome;
	}
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
}
