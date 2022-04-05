package Turma51.Aulas;

import java.util.Scanner;

public class ExemploArray {
	public static void main(String[] args) {
		
		float[] media= new float[3];
		float n1,n2,n3,mediaGeral,somaMedia=0;
		int x;
		
		Scanner ler = new Scanner(System.in);
		
		for(x=0;x<3;x++)
		{
			System.out.println("\nEntre com n1: ");
			n1 = ler.nextFloat();
			System.out.println("\nEntre com n2: ");
			n2 = ler.nextFloat();
			System.out.println("\nEntre com n3: ");
			n3 = ler.nextFloat();
			media[x] = (n1+n2+n3)/3;
			System.out.printf("\nMédia aritimética do alune %d foi de: %2.2f",x+1,media[x]);
			//%d representa um dado do tipo inteiro;
			//%s para string e fora outras opções;
			somaMedia += media[x];
		}
		mediaGeral = somaMedia/3;
		System.out.printf("\nMédia geral da turma: %2.2f",mediaGeral);
	}
}
