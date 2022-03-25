programa
{
	
	funcao inicio()
	{
		real P, E=0.0, M

		escreva("\nQuantos Kg de tomate você possui? ")
		leia(P)

		se (P > 50)
		{
			E = P-50
			M = E*4
			escreva("\nJoão, sua carga apresentou um excesso de ",E," Kg")
			escreva("\n\nO regulamento do Estado de São Paulo estabelece o valor de R$20,00/Kg excedente")
			escreva("\n\nVocê deverá pagar um total de R$",M)
		}
		senao
		{
			E = P-50
			M = E*4
			escreva("\nJoão, sua carga está dentro dos limites tarifários permitido pelo Estado de São Paulo.")
			escreva("\nNão será necessário pagar multa por excesso de carga.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 299; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */