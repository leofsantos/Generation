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
			System.out.println("\nTan�n�n�..Tan�n�n�");
			break;
		default:
			System.out.println("\nTantantar�r�...");
		}
	}
	@Override
	public void disca(String numero)
	{
		System.out.println("\nO n�mero: "+numero+" � um celular...");
	}
	
}
