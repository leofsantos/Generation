programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	 real numero=0.0, soma=0.0, contador=0.0
	
	 enquanto (numero>=0)
	 {
	 	escreva("Entre um número positivo ou digite um negativo para interromper: ")
	 	leia(numero)
	 	se (numero>=0)
	 	{
	 		contador++
	 		soma+=numero
	 	}
	 }	 
	 escreva("\nSomatório dos números vale: ",soma)
	 escreva("\nA média corresponde a: ",mat.arredondar(soma/contador,2))
	 escreva("\nO total de valores lidos foi: ",contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 156; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */