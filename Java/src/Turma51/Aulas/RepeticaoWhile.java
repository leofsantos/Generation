package Turma51.Aulas;

import java.util.Scanner;

public class RepeticaoWhile {
	public static void main(String[] args) {
		
		int num,contNumero=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		num = ler.nextInt();
		
		while(num!=-99)
		{
			contNumero++;
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
		}
		System.out.println("\nQuantidade de números digitados foi de: "+contNumero);
		
	}
	
}
