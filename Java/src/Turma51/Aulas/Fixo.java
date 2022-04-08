package Turma51.Aulas;

public class Fixo extends Telefone {

		public Fixo()
		{
			super("Telefone Fixo");
		}
		
		@Override
		public void toca(int numToques)
		{
			for (int i=0;i<numToques;i++)
			{
				System.out.println("\nTiririm...tiririm...tiririm...alguém ligou pra mim");
			}
		}
		
		@Override
		public void disca(String numero)
		{
			System.out.println("\nDiscando: "+numero);
		}
}
