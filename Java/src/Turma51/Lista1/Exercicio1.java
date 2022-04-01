package Turma51.Lista1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3,maior=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre o primeiro valor: ");
		n1 = ler.nextInt();
		if (n1>maior) {
			maior = n1;
		}
		System.out.println("\nEntre o segundo valor: ");
		n2 = ler.nextInt();
		if (n2>maior) {
			maior = n2;
		}
		System.out.println("\nEntre o terceiro valor: ");
		n3 = ler.nextInt();
		if (n3>maior) {
			maior = n3;
		}
		
		System.out.println("\nOs 3 números digitados foram: "+n1+", "+n2+" e "+n3);
		System.out.println("\nO maior dos números foi "+maior);
	}

}
