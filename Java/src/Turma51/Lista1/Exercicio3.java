package Turma51.Lista1;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade <=14) {
			System.out.println("\nCategoria INFANTIL");
		}
		else if (idade>14 && idade<=17) {
			System.out.println("\nCategoria JUVENIL");
		}
		else if (idade>18 && idade<=25) {
			System.out.println("\nCategoria ADULTO");
		}
		else {
			System.out.println("\nVocê não está dentro da faixa etária possível de ser categorizada.");
		}
	}

}
