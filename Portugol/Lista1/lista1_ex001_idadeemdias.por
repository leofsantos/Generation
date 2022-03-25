programa
{
	
	funcao inicio()
	{
		cadeia nome
		inteiro dia, mes, ano, totalDias

		escreva("\nEntre seu nome: ")
		leia(nome)
		escreva("\nEntre quantos anos você tem: ")
		leia(ano)
		escreva("\nAgora, entre quantos meses você tem: ")
		leia(mes)
		escreva("\nFinalmente, entre quantos dias você tem: ")
		leia(dia)

		totalDias = (ano*365)+(mes*30)+dia
		escreva(nome,", sua idade em dias é: ",totalDias," dias")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */