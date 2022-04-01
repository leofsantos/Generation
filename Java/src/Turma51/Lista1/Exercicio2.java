package Turma51.Lista1;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float n1,n2,n3,maior,meio,menor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite o primeiro valor: ");
		n1 = ler.nextFloat();
		maior = n1;
		meio = n1;
		menor = n1;
		System.out.println("\nDigite o segundo valor: ");
		n2 = ler.nextFloat();
		if (n2 > maior) {
			maior = n2;
		}
		else if (n2 < maior) {
			meio = n2;
			menor = n2;
		}
		System.out.println("\nDigite o terceiro valor: ");
		n3 = ler.nextFloat();
		if (n3 > maior) {
			maior = n3;
		}
		else if (n3< maior && n3 > meio) {
			meio = n3;
		}
		else {
			menor = n3;
		}
		
		System.out.println("\nOs números em ordem crescente ficam: "+menor+", "+meio+", "+maior);
	}

}
