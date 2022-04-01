package Turma51.Lista1;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		double resultado;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com um valor: ");
		numero = ler.nextInt();
		if (numero % 2 == 0) {
			resultado = Math.sqrt(numero);
			System.out.println("\nVocê entrou um número PAR");
			System.out.printf("\nSua raiz vale: %2.2f",resultado);
		}
		else {
			resultado = Math.pow(numero, 2);
			System.out.println("\nVocê entrou um número IMPAR.");
			System.out.printf("\nSeu valor ao quadrado vale: %2.2f",resultado);
		}
		
		
	}

}
