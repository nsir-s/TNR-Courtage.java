@CreationProposition_KO

Feature: CreationProposition

  @Creation_Proposition_par_siret_non_conforme
  Scenario: Creation d une Proposition par Siret
    Given Lancer Spheria
    When  Se connecter sur Spheria avec les identifiants "admin@spheria.com" et "Password2022*"
    And   Remplir la formulaire de tarification en selectionner le projet "PERFORM MA SANTE COLLECTIVE"
    And   Choisir le groupe de courtier "PREVERE"
    And   Selectionner le courtier "FARGENT Angélique"
    Then  Le formulaire de simulateur affiche en cliquant sur le bouton selectionner
    Given Le formulaire de simulateur affiche
    When  Remplir la formulaire des elements du calculateur en selectionner le departement '75 - Paris'
    And   Selectionner le college 'Ensemble du personnel'
    And   Selectionner  le tranche d age '18-39'
    And   Selectionner le taux de comm '5 %'
    And   Selectionner la structure tarifaire 'Isolé Famille'
    And   Selectionner la date d effet '1'
    And   Entrer la Siret de l entreprise "2175000160019"
    Then  Verifier la Siret

  @Creation_Proposition_par_siret_non_correspond_pas_departement
  Scenario: Creation d une Proposition par Siret
    Given Lancer Spheria
    When  Se connecter sur Spheria avec les identifiants "admin@spheria.com" et "Password2022*"
    And   Remplir la formulaire de tarification en selectionner le projet "PERFORM MA SANTE COLLECTIVE"
    And   Choisir le groupe de courtier "PREVERE"
    And   Selectionner le courtier "FARGENT Angélique"
    Then  Le formulaire de simulateur affiche en cliquant sur le bouton selectionner
    Given Le formulaire de simulateur affiche
    When  Remplir la formulaire des elements du calculateur en selectionner le departement '75 - Paris'
    And   Selectionner le college 'Ensemble du personnel'
    And   Selectionner  le tranche d age '18-39'
    And   Selectionner le taux de comm '5 %'
    And   Selectionner la structure tarifaire 'Isolé Famille'
    And   Selectionner la date d effet '1'
    And   Entrer la Siret de l entreprise "22730001900014"
    And   Cliquer sur le formulaire de Siret
    And   Cliquer sur calculer
    Then  La Siret ne correspand pas au departement




