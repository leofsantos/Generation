package Turma51.Lista5;

public class Eletronico {

		private String tipo;
		private String modelo;
		private int ano;
		private double custo;
		private double precoFinal = 0;
		
		//constructor method
		
		public Eletronico(String tipo, String modelo, int ano, double custo,double precoFinal) 
		{
			super();
			this.tipo = tipo;
			this.modelo = modelo;
			this.ano = ano;
			this.custo = custo;
			this.precoFinal = precoFinal;
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
		
		public double getPrecoFinal() {
			return precoFinal;
		}

		public void setPrecoFinal(double precoFinal) {
			this.precoFinal = precoFinal;
		}

		public void fichaTecnica()
		{
			System.out.print("\t\t FICHA TÉCNICA \n\n");
			System.out.print("\nTipo: "+tipo+"\nModelo: "+modelo+"\nAno: "+ano+"\nCusto de Fábrica: R$ "+custo);
		}
		public void venda(double comissao)
		{
			double precoVenda = this.custo+comissao;
			this.precoFinal = precoVenda;
			System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("\nO valor de venda desse produto é de: R$"+precoVenda);
			System.out.print("\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n\n");
		}
		public void estado()
		{
			if(this.ano>=2022)
			{
				System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.print("\nO "+getModelo()+" foi lançado neste ano.");
			}
			else if(this.ano<2022 && this.ano>2015)
			{
				System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.print("\nO "+getModelo()+" foi lançado há menos de 10 anos.");
			}
			else if(this.ano<2015)
			{
				System.out.print("\n- - - - - - - - - - - - - - - - - - - - - - - -");
				System.out.print("\nO "+getModelo()+" foi lançado há mais de 10 anos.");
			}
		}
}
