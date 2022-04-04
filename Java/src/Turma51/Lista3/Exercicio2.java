package Turma51.Lista3;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int x,num,par=0,impar=0;
		Scanner ler = new Scanner(System.in);
		for (x=1;x<=10;x++)
		{
			System.out.print("Entre o "+x+"º número: ");
			num = ler.nextInt();
			if (num%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		System.out.println("\nO total de pares foi: "+par);
		System.out.println("\nO total de ímpares foi: "+impar);
	}
}
