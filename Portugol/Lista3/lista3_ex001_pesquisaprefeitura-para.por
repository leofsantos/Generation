programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	 /*
	 * A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. 
	 * A prefeitura deseja saber:   
	 * a) média do salário da população; 
	 * b) média do número de filhos; 
	 * c) maior salário; 
	 * d) percentual de pessoas com salário até R$100,00.  
	 */
	 real salario, mediaSalario, mediaFilhos, maiorSalario = 0.0, somaSalarios = 0.0, somaFilhos=0.0, percentual, contador = 0.0
	 inteiro x, filhos 

	 para (x=1;x<=20;x++)
	 {
	 	escreva("\nQual o salário do ",x,"º habitante? R$")
	 	leia(salario)
	 	escreva("\nQuantos filhos tem o ",x,"º habitante? ")
	 	leia(filhos)
	 	limpa()
	 	somaSalarios = somaSalarios + salario
	 	somaFilhos = somaFilhos + filhos
	 	se (salario>maiorSalario)
	 	{
	 		maiorSalario = salario
	 	}
	 	se (salario>100)
	 	{
	 		contador++
	 	}
	 }
	 mediaSalario = somaSalarios / 20
	 mediaFilhos = somaFilhos / 20
	 percentual = (contador / 20)*100
	 escreva("\nA média de filhos por habitante vale: ",mat.arredondar(mediaFilhos,0))
	 escreva("\n\nA média de salário entre os habitantes vale: R$ ",mat.arredondar(mediaSalario, 2))
	 escreva("\nO maior salário foi de R$",maiorSalario)
	 escreva("\nO percentual de habitantes com salário maior que R$100,00 foi de",mat.arredondar(percentual, 2),"%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1020; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */