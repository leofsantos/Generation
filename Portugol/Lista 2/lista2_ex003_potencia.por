programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	/*
	 * 3) Desenvolva um sistema em que:
			a.	Leia 4 (quatro) números;
			b.	Calcule o quadrado de cada um;
			c.	Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
			d.	Caso contrário, imprima os valores lidos e seus respectivos quadrados.
	 */
		real n1, n2, n3, n4, q1, q2, q3, q4

		escreva("\nDigite o primeiro número: ")
		leia(n1)
		escreva("\nDigite o segundo número: ")
		leia(n2)
		escreva("\nDigite o terceiro número: ")
		leia(n3)
		escreva("\nDigite o quarto número: ")
		leia(n4)

		q1 = mat.potencia(n1,2.0)
		q2 = mat.potencia(n2, 2.0)
		q3 = mat.potencia(n3, 2.0)
		q4 = mat.potencia(n4, 2.0)

		se (q3>=1000)
		{
			escreva("\nO quadrado do 3º valor vale: ",q3)
		}
		senao
		{
			escreva("\nAs potências encontradas foram: ")
			escreva("\n",n1,"² = ",q1)
			escreva("\n",n2,"² = ",q2)
			escreva("\n",n3,"² = ",q3)
			escreva("\n",n4,"² = ",q4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 84; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */