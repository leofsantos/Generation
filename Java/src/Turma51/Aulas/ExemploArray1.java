package Turma51.Aulas;

import java.util.Scanner;

public class ExemploArray1 {
	public static void main(String[] args) {
		
		//Criando somatório de 6 numeros e descobrindo a média
		
		int[][] numeros = new int[2][3];
		int somaNumeros=0,i,j;
		float mediaNumeros;
		Scanner ler = new Scanner(System.in);
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("Entre com um número para posição ["+i+"]["+j+"]: ");
				numeros[i][j] = ler.nextInt();
				somaNumeros+=numeros[i][j];
			}
		}
		mediaNumeros = somaNumeros/6;
		System.out.printf("\nMédia de números lidos foi de: %5.2f",mediaNumeros);
	}
}
