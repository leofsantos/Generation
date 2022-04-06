package Turma51.Aulas;

public class Automovel {

	//declaracao dos atributos da classe
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//declaracao o metodo construtor
	
	public Automovel (String nomeProprietario,String modelo, String placa, int ano)
	{
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	//declaração dos métodos gerais

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	//criando novo metodo de impressão
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do proprietário: "+nomeProprietario+" possui um "+modelo+" de placa: "+placa+" e ano "+ano);
	}
		
}
