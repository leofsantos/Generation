package Turma51.Aulas;

import java.util.Scanner;

public class RepeticaoDoWhile {
	public static void main(String[] args) {
		
		int num,somaPar=0,somaImpar=0,x;
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("\nEntre com um número: ");
			num = ler.nextInt();
			if (num % 2==0 && num >=0)
			{
				somaPar+=num;
			}
			else if (num%2!=0 && num >=0)
			{
				somaImpar+=num;
			}
		}
		while(num>=0);
		
		System.out.println("\nA soma dos pares resultou em: "+somaPar);
		System.out.println("\nA soma dos ímpares resultou em: "+somaImpar);
	}
}
