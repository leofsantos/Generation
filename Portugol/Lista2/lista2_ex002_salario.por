programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	/*
	 * Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. 
	 * Calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
	 * Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. 
	 * A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
	 */
		real C, N, horaExtra,excedente, salario, total
		cadeia nome

		escreva("\nDigite seu nome: ")
		leia(nome)
		escreva("\nDigite seu código: ")
		leia(C)
		escreva("\n",nome,", Digite a quantidade de horas trabalhadas: ")
		leia(N)

		horaExtra = N-50
		salario = mat.arredondar(N*10, 2)
		excedente = mat.arredondar(horaExtra*20, 2)
		total = mat.arredondar(salario+excedente, 2)
		
		
		se (N<=50)
		{
			excedente = 0.0
			escreva("\n",nome,", seu salário totalizará R$",total)
		}
		senao se (N>50)
		{
			escreva("\n",nome,", como você trabalhou ",horaExtra," horas a mais, seu salário terá um acréscimo de R$",excedente)
			escreva("\n\nTotalizando R$",total)
		}
		senao se (N<=0)
		{
			escreva("\nNúmero de horas inválido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */