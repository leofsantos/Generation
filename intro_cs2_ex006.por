programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real x1,x2,y1,y2,dif1,dif2,d
		escreva("\nEntre um valor para x1:")
		leia(x1)
		escreva("\nEntre um valor para x2:")
		leia(x2)
		escreva("\nEntre um valor para y1:")
		leia(y1)
		escreva("\nEntre um valor para y2:")
		leia(y2)

		dif1 = mat.potencia((x2-x1), 2.0)
		dif2 = mat.potencia((y2-y1), 2.0)

		d = mat.raiz((dif1+dif2), 2.0)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 406; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */