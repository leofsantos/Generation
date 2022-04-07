package Turma51.Lista5;

public class Aviao {
	
	private String modelo;
	private int anoFab;
	private int capacidade;
	private int distMax;
	
	public Aviao (String modelo,int anoFab,int capacidade,int distMax)
	{
		this.modelo = modelo;
		this.anoFab = anoFab;
		this.capacidade = capacidade;
		this.distMax = distMax;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getDistMax() {
		return distMax;
	}

	public void setDistMax(int distMax) {
		this.distMax = distMax;
	}
	public void fichaTecnica()
	{
		System.out.print("\nModelo: "+modelo+"\nFabricação: "+anoFab+"\nCapacidade: "+capacidade+" passageiros "
				+ "\nDist. Máxima: "+distMax+"km");
	}
}
