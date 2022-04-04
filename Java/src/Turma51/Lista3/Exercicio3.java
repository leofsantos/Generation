package Turma51.Lista3;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		int idade,menores21=0,maiores50=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite uma idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			System.out.println("\nDigite outra idade: ");
			idade = ler.nextInt();
			
			if (idade<21 && idade>0)
			{
				menores21++;
			}
			else if (idade>50)
			{
				maiores50++;
			}
		}
		
		System.out.println("\nO total de pessoas com menos de 21 anos foi de: "+menores21);
		System.out.println("\nO total de pessoas com mais de 50 anos foi de: "+maiores50);
	}
}
