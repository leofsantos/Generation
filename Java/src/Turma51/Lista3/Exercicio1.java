package Turma51.Lista3;

public class Exercicio1 {
	public static void main(String[] args) {
		
		int x;
		
		for (x=1000;x<=1999;x++) 
		{
			if (x%11==5)
			{
				System.out.print(x+", ");
			}
		}
	}
}