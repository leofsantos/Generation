package Turma51.Lista5;

public class TesteFuncionario {
	public static void main(String args[])
	{
		Funcionario funcionario1 = new Funcionario("Luís Guerreiro",25,123456,"Desenvolvedor Java",2002,8000);
		System.out.println(funcionario1.toString());
		funcionario1.aumento(2022);
	}
}
