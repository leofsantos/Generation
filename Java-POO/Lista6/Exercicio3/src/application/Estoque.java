package application;

import java.util.List;
import java.util.ArrayList;
import entities.Produto;
import java.util.Scanner;

public class Estoque {

	static List<Produto> listaProdutos = new ArrayList<>();

	public static void main(String args[]) {

		listaProdutos.add(new Produto("MOUSE_SEM_FIO    ","P01",150.00));
		listaProdutos.add(new Produto("FONE_BLUETOOTH","P02",250.00));
		listaProdutos.add(new Produto("CARREGADOR_USB","P03",100.00));
		listaProdutos.add(new Produto("TECLADO_MECÂNICO","P04",179.50));

		catalogo();
		removerEstoque();
		adicionarEstoque();
		
	}
	//MÉTODOS ESPECIFICOS
	
	public static void catalogo() {
		System.out.println("-------------------------------------------------------");
		System.out.println("              NOVO CATALOGO DE PRODUTOS                ");
		System.out.println("-------------------------------------------------------");
		System.out.println("\n NOME\t\t\t CÓDIGO\t VALOR\t      ESTOQUE\n");
		for (Produto prod : listaProdutos) {
			System.out.println(prod.toString());
		}
	}
	public static void removerEstoque() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("                 REMOÇÃO DE PRODUTOS                  ");
		System.out.println("-------------------------------------------------------");
		System.out.println("Digite o código do produto que gostaria de remover: ");
		String codigoInserido = sc.next().toUpperCase();
		if (codigoInserido.equals("P01")) {
			listaProdutos.remove(0);
		} else if (codigoInserido.equals("P02")){
			listaProdutos.remove(1);
		} else if (codigoInserido.equals("P03")){
			listaProdutos.remove(2);
		} else if (codigoInserido.equals("P04")){
			listaProdutos.remove(3);
		}
		System.out.println("-------------------------------------------------------");
		System.out.println("              NOVO CATALOGO DE PRODUTOS                ");
		System.out.println("-------------------------------------------------------");
		System.out.println("\n NOME\t\t\t CÓDIGO\t VALOR\t      ESTOQUE\n");
		for (Produto prod : listaProdutos) {
			System.out.println(prod.toString());
		}
	}
	public static void adicionarEstoque() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-------------------------------------------------------");
		System.out.println("                   ADIÇÃO DE PRODUTOS                  ");
		System.out.println("-------------------------------------------------------");	
		System.out.println("\nEntre com o nome do novo produto: ");
		String novoNome = sc.next().toUpperCase();
		sc.nextLine();
		System.out.println("\nEntre com o código do novo produto: ");
		String novoCodigo = sc.next().toUpperCase();
		sc.nextLine();
		System.out.println("\nEntre com o valor do produto: ");
		double novoPreco = sc.nextDouble();
		listaProdutos.add(new Produto(novoNome,novoCodigo,novoPreco));
		System.out.println("-------------------------------------------------------");
		System.out.println("              NOVO CATALOGO DE PRODUTOS                ");
		System.out.println("-------------------------------------------------------");
		System.out.println("\n NOME\t\t\t CÓDIGO\t VALOR\t      ESTOQUE\n");
		for (Produto prod : listaProdutos) {
			System.out.println(prod.toString());
		}
	}
}
