package Turma51;

import java.util.Scanner;

public class LacoDecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEscolha um elogio: ");
		System.out.println("\n[1] Acolhedora");
		System.out.println("\n[2] Unida");
		System.out.println("\n[3] Inteligente");
		System.out.println("\n[4] Animade");
		System.out.println("\nEntre sua op��o: ");
		op = ler.nextInt();
		
		switch(op) {
			case 1:
				System.out.println("\nA turma � Acolhedora!");
				break;
			case 2:
				System.out.println("\nA turma � Unida!");
				break;
			case 3:
				System.out.println("\nA turma � Inteligente!");
				break;
			case 4:
				System.out.println("\nA turma � Animade!");
				break;
			default:
				System.out.println("\nVoc� digitou uma op��o inv�lida.");
		}

	}

}
