package Turma51.Aulas;

public class TesteAutomovel {
	public static void main(String[] args) {
		
		//Instanciando um objeto da classe automóvel
		
		Automovel auto1 = new Automovel("Leonardo Filipe","HB20","OYN1234",2022);
		
		auto1.imprimirInfo();
		
		System.out.println("\n * * * * * Transferência de proprietário * * * ");
		
		auto1.setNomeProprietario("Mariana Theml");
		
		auto1.imprimirInfo();
	}
}
