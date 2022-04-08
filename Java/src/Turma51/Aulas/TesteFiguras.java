package Turma51.Aulas;

public class TesteFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrado fig1 = new Quadrado(10,"quadrado1");
		Retangulo fig2 = new Retangulo(3,4,"retangulo1");
		
		System.out.printf("\n"+fig1.getNome()+" : "+fig1.getDiagonal());
	}

}
