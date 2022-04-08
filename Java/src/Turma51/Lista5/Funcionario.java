package Turma51.Lista5;

public class Funcionario {

	private String nome;
	private int idade;
	private double identificacao;
	private String funcao;
	private int anoEntrada;
	private double salario;

	// constructor method
	public Funcionario(String nome, int idade, double identificacao, String funcao, int anoEntrada, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.identificacao = identificacao;
		this.funcao = funcao;
		this.anoEntrada = anoEntrada;
		this.salario = salario;
	}

	// getters and setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(double identificacao) {
		this.identificacao = identificacao;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public int getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	// specific methods

	
	public void aumento(int anoAtual) {

		int tempoDeServico = anoAtual - this.anoEntrada;
		double novoSalario = (this.salario*(1 + ((double)tempoDeServico / 100)));
		this.salario = novoSalario;
		System.out.println("\nO novo salário será de: R$" + this.salario);
	}
	
	public String toString() {
		return "\nNome: " + this.nome + "\nFunção: " + this.funcao + "\nAno de Admissão: " + this.anoEntrada
		+ "\nSalário: R$" + this.salario;
	}	
}
