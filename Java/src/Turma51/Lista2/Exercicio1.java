package Turma51.Lista2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] agrs) {
		
		int ano, mes, dia, totalDias;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("\nDigite quantos anos você tem: ");
		ano = ler.nextInt();
		System.out.println("\nAgora, digite quantos meses: ");
		mes = ler.nextInt();
		System.out.println("\nPor fim, quantos dias: ");
		dia = ler.nextInt();
		
		totalDias = (ano*365) + (mes*30) + dia;
		
		System.out.println("\nSua idade em dias é "+totalDias+".");
		
	}
}
