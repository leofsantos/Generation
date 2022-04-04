package Turma51.Lista3;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] agrs) {
		
		int num, soma=0;
		
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um número do seu teclado: ");
		num = ler.nextInt();
		soma+=num;
		
		do
		{
			System.out.print("Digite um número do seu teclado: ");
			num = ler.nextInt();
			soma+=num;
		}
		while(num!=0);
		System.out.println("\nA soma dos números digitados vale: "+soma);
	}
}
