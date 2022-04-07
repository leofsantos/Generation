package Turma51.Aulas;

public class TesteEmpregado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado lista[] = new Empregado[3];
		
		lista[0] = new Empregado("Kamila Lima",5000);
		lista[1] = new Empregado("Lavínia Amorim",20000);
		lista[2] = new Empregado("Cláudio Pereira",13000);
		
		for(Empregado loop:lista)
		{
			loop.imprimir();
		}
		
		System.out.println("\n * * * * * * * * * * * * ");
		
		for(Empregado loop:lista)
		{
			loop.aumentarSalario(10);
			loop.imprimir();
		}
		
	}

}
