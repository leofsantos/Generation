package Turma51.Aulas;

public class TesteAutomovel {
	public static void main(String[] args) {
		
		//Instanciando um objeto da classe autom�vel
		
		Automovel auto1 = new Automovel("Leonardo Filipe","HB20","OYN1234",2022);
		
		auto1.imprimirInfo();
		
		System.out.println("\n * * * * * Transfer�ncia de propriet�rio * * * ");
		
		auto1.setNomeProprietario("Mariana Theml");
		
		auto1.imprimirInfo();
	}
}
