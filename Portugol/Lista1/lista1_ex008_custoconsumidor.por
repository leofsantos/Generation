programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real cConsumidor, cFabrica, distribuidor, tax
		escreva("\nQual o custo de fábrica desse produto? R$ ")
		leia(cFabrica)

		distribuidor = cFabrica*0.28
		tax = cFabrica*0.45
		cConsumidor = cFabrica + distribuidor + tax
		
		escreva("\nO custo total para o consumidor será de R$ ",mat.arredondar(cConsumidor,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 387; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */