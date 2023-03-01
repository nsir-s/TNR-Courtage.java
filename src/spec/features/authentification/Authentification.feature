@Authentifier

  Feature: Authentifier
                     ############
  @getByPersonneMorale
  Scenario: getByPersonneMorale
    Given Je me connecte à l'application
    When  Je saisis le user name "admin@spheria.com"
    And   Je saisis le mot de passe "Password2022*"
    And   Je clique sur le bouton Login
    Then  Je me redirige vers la page dashboard





