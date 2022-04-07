package Turma51.Lista5;

public class Eletronico {

		private String tipo;
		private String modelo;
		private int ano;
		private double custo;
		
		//constructor method
		
		public Eletronico(String tipo, String modelo, int ano, double custo) 
		{
			super();
			this.tipo = tipo;
			this.modelo = modelo;
			this.ano = ano;
			this.custo = custo;
		}
		
		//getters and setters

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		public double getCusto() {
			return custo;
		}

		public void setCusto(float custo) {
			this.custo = custo;
		}
		public void fichaTecnica()
		{
			System.out.print("\nTipo: "+tipo+"\nModelo: "+modelo+"\nAno: "+ano+"\nCusto de Fábrica: R$ "+custo);
		}
}
