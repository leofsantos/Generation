package Turma51.Lista2;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1,x2,y1,y2;
		double d,x,y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nCoordenada X1: ");
		x1 = ler.nextInt();
		System.out.println("\nCoordenada X2: ");
		x2 = ler.nextInt();
		System.out.println("\nCoordenada Y1: ");
		y1 = ler.nextInt();
		System.out.println("\nCoordenada Y2: ");
		y2 = ler.nextInt();
		
		x = Math.pow((x2-x1), 2);
		y = Math.pow((y2-y1), 2);
		d = Math.sqrt(x+y);
		
		System.out.printf("\nO valor da distância entre os dois pontos vale: %2.2f",d);
		
		
		
	}

}
