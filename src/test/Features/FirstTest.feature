# new feature
# Tags: optional

Feature: Acessar página do google

  Scenario: Realizar a busca por pão de queijo
    Given eu acesso a página do google
    And clico no campo de busca
    When eu digito um texto
    Then clico em pesquisar