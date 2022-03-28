programa
{
	
	funcao inicio()
	{
		inteiro valor[10], contador=0, maiorPontuacao=0, soma=0, x
		real media=0.0

		para (x=0;x<10;x++)
		{
			escreva("\nEntre o ",x+1,"º lançamento: ")
			leia(valor[x])
			limpa()
			enquanto(valor[x]>6)
			{
				escreva(valor[x]," é um resultado inválido.")
				escreva("\nEntre um valor positivo entre 1 e 6: ")
				leia(valor[x])
			}
			soma+=valor[x]
			limpa()
			se (valor[x] > maiorPontuacao)
			{
				maiorPontuacao = valor[x]
				contador = 0
			}
			se (valor[x]==maiorPontuacao)
			{
				contador++
			}
		}
		media = soma / 10.0
		escreva("\nA maior pontuação dos lançamentos foi de ",maiorPontuacao," e apareceu ",contador, " vez(es).")
		escreva("\nO valor médio dos lançamentos foi de ",media)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 240; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */