package Turma51.Lista3;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] agrs) {
		
		int n,soma=0,mult3=0;
		float media;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.print("Entre com um n�mero inteiro qualquer [Digite '0' para finalizar]: ");
			n = leia.nextInt();
			if(n==0)
			{
				System.out.println("\nObrigado por utilizar o software. At� mais!");
			}
			else
			{
				if (n%3==0)
				{
					soma+=n;
					mult3++;
				}
			}
		}
		while(n!=0);
		media = soma/mult3;
		System.out.print("\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * *  *");
		System.out.printf("\nM�dia dos n�meros m�ltiplos de 3 = %6.2f",media);
	}
}
