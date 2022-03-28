programa
{
	
	funcao inicio()
	{
		inteiro N1[2][3],N2[2][3],M1[2][3],M2[2][3],l,c

		para(l=0;l<2;l++)
		{
			para (c=0;c<3;c++)
			{
				escreva("\nEntre os valores de N1 para o elemento ",l+1,".",c+1,": ")
				leia(N1[l][c])
				escreva("\nEntre os valores de N2 para o elemento ",l+1,".",c+1,": ")
				leia(N2[l][c])
				M1[l][c] = N1[l][c] + N2[l][c]
				M2[l][c] = N1[l][c] - N2[l][c]
			}
		}
		para(l=0;l<2;l++)
		{
			para(c=0;c<3;c++)
			{
				escreva("\nM1 = ",M1[l][c])
				escreva("\nM2 = ",M2[l][c])
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = 16, 17, 6, 24, 25, 12, 13, 14, 15;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */