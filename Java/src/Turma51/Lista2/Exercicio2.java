package Turma51.Lista2;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		int idade, dia, ano, mes;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite quantos dias de vida você tem: ");
		idade = ler.nextInt();
		
		ano = idade/365;
		mes = (idade%365)/30;
		dia = (idade%365)%30;
		
		System.out.println("\nVocê tem "+ano+" anos, "+mes+" mes(es) e "+dia+" dia(s) de vida.");
		
	}
}
