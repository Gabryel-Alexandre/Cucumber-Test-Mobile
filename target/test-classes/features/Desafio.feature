#language: pt
#enconding: UTF-8

Funcionalidade: Iteracao cliente 

	Contexto:
	Quando aparecer a mensagem clicar no botao permitir 
	
	Cenario: Cenario completo criacao de listas e notas manipulacao de listas definir lembretes excluir listas 
		Quando eu clicar no botao plus 
		E clicar em texto 
		E digitar o texto  "Teste automacao"
		E clicar no botao confirmar
		Entao confirmar que foi criada 
		Quando eu clicar no botao plus
		E clicar em lista 
		E Adicionar colocar o nome da lista "Lista Teste"
		E clicar no botao adicionar primeiro item 
		E adicionar item com nome "Item 1"
		E clicar no botao proximo 
		E adicionar item com nome "Item 2"
	 	E clicar no botao proximo
	 	E adicionar item com nome "Item 3"
	 	E clicar no botao ok
	 	E clicar no botao confirmar
	 	Entao confirmar que foi criada 
	 	Quando eu acionar a lista
	 	E eu acionar o botao mais opcoes
	 	E acionar o botao lembrete 
	 	E acionar o botao quinze minutos
	 	E clicar no botao pronto
	 	Entao confirmar que foi criada   
	 	Quando eu acionar a lista
	 	E acionar o item da lista 
	 	Entao confirmar que foi criada 
	 	Quando eu acionar a nota
	 	E eu acionar o botao mais opcoes
	 	E acionar a opcao remover
	 	E clicar no botao ok 
	 	Quando clicar e segurar em cima da lista
	 	E acionar o botao cor
	 	E acionar a cor preta
	 	
	 	
	 	