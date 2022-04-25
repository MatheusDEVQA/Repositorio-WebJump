# language: pt
#Author: matheus_muniz3@hotmail.com.br


@todos
Funcionalidade: Cilcar os botões e validar a ausência

Fundo: Acessar a página
Dado que estamos no "https://wj-qa-automation-test.github.io/qa-test/"
 @cenario1
  Cenário:  Clicamos nos botões One, Two, e Four
    Quando clicamos nos botões One, Two e Four
    Então eles deixam de existir
    
  Cenário: Clicamos nos botões One, Two, e Four dentro do painel IFRAME BUTTONS
    Quando clicar nos botões
    Então deverão ficar ausentes  
    
    Cenário: Preencher o campo YourFirstName, clique no botão One, cheque a opção OptionThree, 
    selecione a opção exampleTwo dentro da select box, e valide a presença da imagem do logo 
    do Selenium Webdriver
    Então escrever texto qualquer em yourFirstname
    E clicar no botão one
    E cheque a opção optionThree
    E And some other precondition
    Quando When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
 

 
