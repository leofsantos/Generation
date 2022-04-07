package Turma51.Lista5;

public class TesteEletronico {
	public static void main(String args[]) {
		
		Eletronico eletronico1 = new Eletronico("Celular","iPhone 12",2020,5000);
		Eletronico eletronico2 = new Eletronico("Celular","Nokia 3310",2000,300);
		Eletronico eletronico3 = new Eletronico("Notebook","Dell Inspiron 15 3000",2019,2500);
		
		eletronico1.fichaTecnica();
		System.out.print("\n\n* * * * * * * * * * * * * * * \n");
		eletronico2.fichaTecnica();
		System.out.print("\n\n* * * * * * * * * * * * * * * \n");
		eletronico3.fichaTecnica();
		System.out.print("\n\n* * * * * * * * * * * * * * * \n\n");
		
	}
}
