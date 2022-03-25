programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real x,y,a,b,c,d,E,f
		escreva("\nDigite um valor para a: ")
		leia(a)
		escreva("\nDigite um valor para b: ")
		leia(b)
		escreva("\nDigite um valor para c: ")
		leia(c)
		escreva("\nDigite um valor para d: ")
		leia(d)
		escreva("\nDigite um valor para e: ")
		leia(E)
		escreva("\nDigite um valor para f: ")
		leia(f)
		x = (c*E - b*f)/(a*E - b*d)
		y = (a*f - c*d)/(a*E - b*d)
		escreva("\nO valor de X é: ", mat.arredondar(x,2))
		escreva("\nO valor de Y é: ", mat.arredondar(y,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 555; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */