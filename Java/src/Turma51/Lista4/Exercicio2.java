package Turma51.Lista4;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int numero[] = new int[6];
		int n,x,somaPar=0,contImpar=0;
		Scanner sc = new Scanner(System.in);
		
		for(x=0;x<numero.length;x++)
		{
			System.out.printf("Entre com o %dº número: ",x+1);
			n = sc.nextInt();
			numero[x] = n;
			if (n%2==0)
			{
				somaPar+=numero[x];
			}
			else
			{
				contImpar++;
			}
		}
		System.out.print("\n\n* * * * * * * * * * * * * * * * * * *\n\n");
		System.out.print("\nOs pares digitados foram: ");
		for(x=0;x<numero.length;x++)
		{
			if(numero[x]%2==0)
			{
				System.out.print("["+numero[x]+"] ");
			}
			
		}
		System.out.print("\nA soma dos pares vale: "+somaPar);
		System.out.print("\nOs ímpares digitados foram: ");
		for(x=0;x<numero.length;x++)
		{
			if(numero[x]%2!=0)
			{
				System.out.print("["+numero[x]+"] ");
			}
		}
		System.out.print("\nTotalizando: "+contImpar+" ímpares.");
	}
}
