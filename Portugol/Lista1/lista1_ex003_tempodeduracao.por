programa
{
	
	funcao inicio()
	{
		inteiro horas, minutos, segundos, totalTempo

		escreva("\nDigite o tempo do evento em segundos: ")
		leia(totalTempo)

		horas = totalTempo/3600
		minutos = (totalTempo - (horas*3600))/60
		segundos = totalTempo % 60

		escreva("O tempo do evento é ",horas," horas, ",minutos," minutos e ",segundos," segundos")
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