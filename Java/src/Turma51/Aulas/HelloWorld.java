package Turma51;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3;
		
		System.out.println("\nA m�dia aritim�tica foi de: "+media);
		System.out.printf("\nA m�dia aritim�tica arredondada foi: %2.2f",media);
		
		if (media>=7 && media<=10) {
			System.out.println("\nAlune aprovade!");
		}
		else if (media>=5 && media<7) {
			System.out.println("\nAlune de recupera��o.");
		}
		else {
			System.out.println("\nAlune reprovade.");
		}
	}

}
