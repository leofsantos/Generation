programa
{
	inclua biblioteca Matematica-->mat	
	funcao inicio()
	{
		inteiro a,b,c
		real d,r,s
		escreva("\nDigite um valor inteiro e positivo para A: ")
		leia(a)
		escreva("\nDigite um valor inteiro e positivo para B: ")
		leia(b)
		escreva("\nDigite um valor inteiro e positivo para C: ")
		leia(c)

		r = mat.raiz((a+b), 2.0)
		s = mat.raiz((b+c), 2.0)
		d = (r+s)/2

		escreva("\nR = ",mat.arredondar(r,2))
		escreva("\nS = ",mat.arredondar(s,2))
		escreva("\nD = ",mat.arredondar(d,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 497; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */