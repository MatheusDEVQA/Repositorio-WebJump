# language: pt
#Author: matheus_muniz3@hotmail.com.br


@executa
Funcionalidade: 
 Title of your feature
  I want to use this template for my feature file

  @tag1
  Cenário:  Title of your scenario
    Dado Given I want to write a step with precondition
    E And some other precondition
    Quando When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Exemplos: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
