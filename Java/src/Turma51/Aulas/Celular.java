package Turma51.Aulas;

public class Celular extends Telefone {
	
	//constructor 
	
	public Celular()
	{
		//indicating those parameters initialize at our superclass
		super("Telefone Celular");
	}
	
	//@Override indicate as polymorphic
	
	@Override
	public void toca(int codigoToque)
	{
		switch(codigoToque)
		{
		case 1:
			System.out.println("\nToque...toque...toque");
			break;
		case 2:
			System.out.println("\nTanãnãnã..Tanãnãnã");
			break;
		default:
			System.out.println("\nTantantarãrã...");
		}
	}
	@Override
	public void disca(String numero)
	{
		System.out.println("\nO número: "+numero+" é um celular...");
	}
	
}
