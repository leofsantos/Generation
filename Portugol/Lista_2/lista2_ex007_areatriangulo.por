programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	/*
	 * 7)	Receber valores de base e altura de um triângulo e verificar se são valores válidos (positivos maiores que zero). 
	 * 		Em caso afirmativo, calcular a área do triângulo.
	 */
		real base,altura,area
		escreva("\nEntre um valor para base: ")
		leia(base)
		escreva("\nEntre um valor para altura: ")
		leia(altura)
		area = (base * altura) / 2

		se (base>0 e altura>0)
		{
			escreva("\nPara uma base = ",base," e altura = ",altura,", teremos uma área = ",mat.arredondar(area,2)," u.a.") //u.a. = unidades de área
		}
		senao
		{
			escreva("\nVocê não inseriu todos os valores positivos maiores que zero.")
			escreva("\n\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 561; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */