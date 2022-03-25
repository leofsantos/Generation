programa
{
	
	funcao inicio()
	{
	/*
	 * 8)	Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100, 
	 * 		Caso contrário imprimi-la com o valor zero.
	 */
		real N

		escreva("\nAtribua um valor para N menor que 100: ")
		leia(N)

		se (N<=100)
		{
			escreva("\nVocê atribuiu ",N)
		}
		senao
		{
			N = 0.0
			escreva("\nVocê atribuiu um valor superior. Seu resultado foi anulado.")
			escreva("\nN = ",N)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */