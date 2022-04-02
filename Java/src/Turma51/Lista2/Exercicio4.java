package Turma51.Lista2;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		double d;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre um valor para A: ");
		a = ler.nextInt();
		System.out.println("\nEntre um valor para B: ");
		b = ler.nextInt();
		System.out.println("\nEntre um valor para C: ");
		c = ler.nextInt();
		
		d = (Math.pow((a+b), 2)+Math.pow((b+c),2)) / 2;
		
		System.out.printf("\nO valor de D é: %2.2f ",d);
	}

}
