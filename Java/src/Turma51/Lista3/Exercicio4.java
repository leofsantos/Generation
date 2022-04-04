package Turma51.Lista3;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		int idade,genero,fatorP,pessoasCalmas=0,mulherNervosa=0,homemAgressivo=0,nbCalmes=0,nervosos40=0,calmos18=0,x=1;
		Scanner ler = new Scanner(System.in);
		
		while(x<=5)
		{
			System.out.println("\n\n\nEntre com a idade da "+x+"ª pessoa: ");
			idade = ler.nextInt();
			while(idade<1 || idade>130)
			{
				System.out.println("\nIdade inválida. \nEntre novamente com a idade da "+x+"ª pessoa: ");
				idade = ler.nextInt();
			}
			System.out.println("\nGêneros: \n\n[1]-Masculino \n[2]-Feminino \n[3]-Não Binário \n\nEntre com o gênero da "+x+"ª pessoa: ");
			genero = ler.nextInt();
			while(genero<1 || genero>3)
			{
				System.out.println("\nDado inválido. Entre com alguma das opções abaixo.");
				System.out.println("\nEntre com seu gênero: \n[1]-Masculino \n[2]-Feminino \n[3]-Não Binário ");
				genero = ler.nextInt();
			}
			System.out.println("\nEntre com o Fator Psicológico da "+x+"ª pessoa: ");
			System.out.println("\n[1]-Pessoa Calma \n[2]-Pessoa Nervosa \n[3]-Pessoa Agressiva");
			fatorP = ler.nextInt();
			while(fatorP<1 || fatorP>3)
			{
				System.out.println("\nDado inválido. Entre novamente alguma das opções abaixo.");
				System.out.println("\n[1]-Pessoa Calma \n[2]-Pessoa Nervosa \n[3]Pessoa Agressiva");
				System.out.println("\nEntre novamente com o Fator Psicológico da "+x+"ª pessoa: ");
				fatorP = ler.nextInt();
			}
			System.out.print("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
			if (fatorP==1)
			{
				pessoasCalmas++;
			}
			if (genero==2 && fatorP==2)
			{
				mulherNervosa++;
			}
			if (genero==1 && fatorP==3)
			{
				homemAgressivo++;
			}
			if (genero==3 && fatorP==1)
			{
				nbCalmes++;
			}
			if (fatorP==2 && idade>40)
			{
				nervosos40++;
			}
			if (fatorP==1 && idade<18)
			{
				calmos18++;
			}
			x++;
		}
		System.out.println("\nExistem "+pessoasCalmas+" pessoas calmas.");
		System.out.println("\nExistem "+mulherNervosa+" mulheres nervosas.");
		System.out.println("\nExistem "+homemAgressivo+" homens agressivos.");
		System.out.println("\nExistem "+nbCalmes+" não-binários calmes.");
		System.out.println("\nExistem "+nervosos40+" pessoas nervosas com mais de 40 anos");
		System.out.println("\nExistem "+calmos18+" pessoas calmas com menos de 18 anos.");
	}
}
