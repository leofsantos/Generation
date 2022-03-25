programa
{
	
	funcao inicio()
	{ 
	/*
	 * Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	 * 	a.	Infantil A = 5 a 7 anos
	 * 	b.	Infantil B = 8 a 11 anos
	 * 	c.	Juvenil A = 12 a 13 anos
	 * 	d.	Juvenil B = 14 a 17 anos
	 * 	e.	Adultos = Maiores de 18 anos

	 */
		inteiro idade
		escreva("\nEntre com a sua idade: ")
		leia(idade)

		se (idade>=5 e idade<=7)
		{
			escreva("\nSua categoria é: Infantil A")
		}
		senao se (idade>=8 e idade<=11)
		{
			escreva("\nSua categoria é: Infantil B")
		}
		senao se (idade>=12 e idade<=13)
		{
			escreva("\nSua categoria é: Junvenil A")
		}
		senao se (idade>=14 e idade<=17)
		{
			escreva("\nSua categoria é: Juvenil B")
		}
		senao se (idade>=18)
		{
			escreva("\nSua categoria é: Adulto")
		}
		senao 
		{
			escreva("\nSem categoria.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */