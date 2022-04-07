package Turma51.Lista5;

import java.util.Scanner;

public class TesteCliente {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Luís Guerreiro","123.456.789-10",25);
		
		cliente1.imprimir();
		
		System.out.println("\n* * * * * * * * Novo Cliente * * * * * * * *");
		
		cliente1.setNomeCliente("Kelly Knoblauch");
		
		cliente1.setCpf("987.654.321-00");
		
		cliente1.setIdade(26);
		cliente1.imprimir();
		
	}
}
