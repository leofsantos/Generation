package Turma51.Lista5;

public class TesteEletronico {
	public static void main(String args[]) {
		
		Eletronico eletronico1 = new Eletronico("Celular","iPhone 12",2020,5000,0);
		Eletronico eletronico2 = new Eletronico("Celular","Nokia 3310",2000,300,0);
		Eletronico eletronico3 = new Eletronico("Notebook","Dell Inspiron 15 3000",2019,2500,0);
		
		eletronico1.fichaTecnica();
		eletronico1.estado();
		eletronico1.venda(1500);
		
		eletronico2.fichaTecnica();
		eletronico2.estado();
		eletronico2.venda(200);
		
		eletronico3.fichaTecnica();
		eletronico3.estado();
		eletronico3.venda(3000);
	}
}
