package Turma51.Lista5;

public class Cliente {
	//declaration of client's attributes
	
	private String nomeCliente;
	private String cpf;
	private int idade;
	
	
	//declaration of construction method 
	
	public Cliente (String nomeCliente,String cpf,int idade)
	{
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.idade = idade;
	}

	//declaration of general methods	
	
	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimir()
	{
		System.out.println("\nNOME: "+nomeCliente+"\nCPF: "+cpf+"\nIDADE: "+idade+" anos");
	}
}
