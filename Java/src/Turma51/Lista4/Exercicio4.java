package Turma51.Lista4;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int i,j,op;
		float k;
		Scanner ler = new Scanner(System.in);
		
		
		for (i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.println("\nEntre com o valor da Matriz 1: ");
				matriz1[i][j] = ler.nextFloat();
				System.out.println("\nEntre com o valor da Matriz 1: ");
				matriz2[i][j] = ler.nextFloat();
			}
		}
		
		do
		{
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
			System.out.println("\n\t\tMenu de opções");
			System.out.println("\n[1] - Somar (Matriz 1 - Matriz 2");
			System.out.println("\n[2] - Subtrair (Matriz 2 - Matriz 1");
			System.out.println("\n[3] - Adicionar uma constante às duas matrizes");
			System.out.println("\n[4] - Imprimir as matrizes");
			System.out.println("\n[0] - Sair do programa");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nSoma das Matrizes: "+matriz3[i][j]);
					}
				}
				break;
			case 2:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nSubtração das Matrizes: "+matriz3[i][j]);
					}
				}
				break;
			case 3:
				System.out.println("\nEntre com o valor da constante: ");
				k = ler.nextInt();
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						matriz1[i][j]+=k;
						matriz2[i][j]+=k;
						System.out.println("\nMatriz 1: "+matriz1[i][j]);
						System.out.println("\nMatriz 2: "+matriz2[i][j]);
					}
				}
				break;
			case 4:
				for(i=0;i<2;i++)
				{
					for(j=0;j<2;j++)
					{
						System.out.println("\nMatriz 1: "+matriz1[i][j]);
						System.out.println("\nMatriz 2: "+matriz2[i][j]);
					}
				}
				break;
				default:
					if(op<0 || op>4)
					{
						System.out.println("\nOpção inválida.");
					}
					else if (op==0)
					{
						System.out.println("\nObrigado por usar nosso Software!!!");
					}
					else
					{
						System.out.println("\nVamos iniciar novamente nosso sistema");
					}
			}
		}
		while(op!=0);
	}

}
