package Turma51.Lista4;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		
		float m[][] = new float[3][3];
		int i,j,cont=0;
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m.length;j++)
			{
				System.out.print("Entre um valor para posição["+i+"]["+j+"]: ");
				m[i][j] = sc.nextFloat();
				if(m[i][j]>10)
				{
					cont++;
				}
			}
		}
		System.out.print("\nOs valores maiores que 10 foram: ");
		for(i=0;i<m.length;i++)
		{
			for(j=0;j<m.length;j++)
			{
				if(m[i][j]>10)
				{
					System.out.print("["+m[i][j]+"]");
				}
				if(cont==0 && i==2 && j==2)
				{
					System.out.print("nenhum.");
				}
			}
		}
		System.out.print("\nUm total de "+cont+" números maiores que 10.");
	}
}
