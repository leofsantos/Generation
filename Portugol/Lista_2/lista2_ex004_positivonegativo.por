programa
{
	
	funcao inicio()
	{
	/*
	 * 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.
	 */
		inteiro num

		escreva("\nEntre com um número: ")
		leia(num)

		se(num % 2 == 0) // dentro desse Se é par
		{
			se(num>=0) //positivo
			{
				escreva("\nPar e positivo")
			}
			senao //negativo
			{
				escreva("\nPar e negativo")
			}
		}
		senao
		{
			se(num>=0)
			{
				escreva("\nImpar e positivo")
			}
			senao
			{
				escreva("\nImpar e negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 154; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */