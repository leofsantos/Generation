package Turma51.Aulas;

public class Publico extends Telefone {
	
	public Publico()
	{
		super("Telefone Público");
	}
	
	@Override
	public void toca(int numToques)
	{
		for(int i=0;i<numToques;i++)
		{
			System.out.println("\nTrimmmmm");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		//charAt searches for an information @ our String @ [position]
		if(numero.charAt(0)=='9' || numero.charAt(0)=='8')
		{
			System.out.println("\nEste telefone não liga para celular...");
		}
		else
		{
			System.out.println("\nDiscando: "+numero);
		}
	}
}
