package Turma51.Aulas;

import java.util.Scanner;

public class RepeticaoFor {
	public static void main(String[] args) {
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		int x;
		Scanner ler = new Scanner(System.in);
		
		for (x=1;x<=3;x++) 
		{
			System.out.println("\nEntre com a 1� nota: ");
			n1 = ler.nextFloat();
			System.out.println("\nEntre com a 2� nota: ");
			n2 = ler.nextFloat();
			System.out.println("\nEntre com a 3� nota: ");
			n3 = ler.nextFloat();
			
			media = (n1+n2+n3) / 3;
			
			System.out.printf("\nA m�dia aritim�tica foi de: %2.2f",media);
			somaMedia+=media;
		}
		mediaGeral = somaMedia / 3;
		System.out.printf("\nM�dia geral: %2.2f",mediaGeral);
	}
}
