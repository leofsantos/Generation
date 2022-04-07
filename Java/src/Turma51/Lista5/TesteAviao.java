package Turma51.Lista5;

public class TesteAviao {
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao("Sikorsky Ilya Muromets",1913,16,1000);
		Aviao aviao2 = new Aviao("Junkers F13",1919,4,1400);
		Aviao aviao3 = new Aviao("Airbus A380",2007,845,14800);
		aviao1.fichaTecnica();
		System.out.print("\n\n* * * * * * * * * * * * * * * \n");
		aviao2.fichaTecnica();
		System.out.print("\n\n* * * * * * * * * * * * * * * \n");
		aviao3.fichaTecnica();
	}
}
