programa
{
	
	funcao inicio()
	{
		inteiro pontuacao[5], maiorPontuacao=0, x

		para (x=0;x<5;x++)
		{
			escreva("\nEntre uma pontuação: ")
			leia(pontuacao[x])
			limpa()

			se (pontuacao[x]>maiorPontuacao)
			{
				maiorPontuacao = pontuacao[x]
			}
		}
		para (x=0;x<5;x++)
		{
			escreva("\nA ",x+1,"ª pontuação foi: ",pontuacao[x],"\n")
		}
		escreva("\nA maior pontuação foi de ",maiorPontuacao)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */