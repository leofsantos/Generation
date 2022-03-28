programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		inteiro x, valor[10], soma=0,maiorPontuacao=0
		real media

		para (x=0;x<10;x++)
		{
			escreva("\nEntre o valor do ",x+1,"º lançamento: ")
			leia(valor[x])
			limpa()
			enquanto (valor[x] > 6)
			{
				escreva(valor[x]," é um resultado inválido para o ",x+1,"º lançamento.")
				escreva("\nEntre um valor entre 1 e 6: ")
				leia(valor[x])
				limpa()
			}
			soma+=valor[x]
			se (valor[x] == 6)
			{
				maiorPontuacao++
			}
		}
		para (x=0;x<10;x++)
		{
			escreva("\nO valor do ",x+1,"º lançamento foi: ", valor[x])
		}
		media = soma / 10
		escreva("\n\nO valor médio entre os lançamentos foi de: ",mat.arredondar(media,0))
		se (maiorPontuacao>1)
		{
			escreva("\n\nA maior pontuação ocorreu ",maiorPontuacao," vezes.")
		}
		senao se (maiorPontuacao == 1)
		{
			escreva("\n\nA maior pontuação ocorreu apenas ",maiorPontuacao," vez.")
		}
		senao
		{
			escreva("\n\nA maior pontuação não ocorreu em nenhum dos lançamentos.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 729; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */