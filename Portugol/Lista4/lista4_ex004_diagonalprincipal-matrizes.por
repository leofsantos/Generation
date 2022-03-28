programa
{
	
	funcao inicio()
	{
		inteiro valores[3][3], somaValores=0, linha, coluna

		para (linha=0;linha<3;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nEntre um valor: ")
				leia(valores[linha][coluna])
				se(linha == coluna)
				{
					somaValores+=valores[linha][coluna]
				}
			}
		}
		escreva("\nA soma dos valores da diagonal principal vale: ",valores[0][0]," + ",valores[1][1]," + ",valores[2][2]," = ",somaValores)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 425; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {valores, 6, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */