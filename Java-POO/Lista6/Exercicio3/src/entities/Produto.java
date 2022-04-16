package entities;

public class Produto {
	
	private String nome;
	private String codigo;
	private double valor;
	private int carrinho;
	private int estoque=10;
	
	public Produto(String nome, String codigo, double valor) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(int carrinho) {
		this.carrinho = carrinho;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String toString() {
		return " "+nome+" \t  "+codigo+" \t "+valor+"\t\t"+estoque;
	}

	
	
	
}
