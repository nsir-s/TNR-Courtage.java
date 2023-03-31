@CreationProposition_OK

  Feature: CreationProposition
                     ############
  @Creation_Proposition_par_raison_sociale
  Scenario: Creation d une Proposition par raison sociale
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
    And   Cliquer sur ENTREPRISE EN COURS DE CREATION
    And   Entrer la raison sociale d une entreprise 'Harmonie Mutuelle Courtage Paris'
    And   Cliquer sur calculer
    Then  Les trois formules s'affiche
    Given Choisir la formule correpandante
    When  Recuperer les informations de la formule
    And   Selectioner les options que vous souhaitez
    And   Selectionner la formule
    Then  Redirection vers la page de synthese de proposition
    Given La page de synthese affiche  recuperation des informations de formule
    When  Entrer les info de signataire nom 'Sirigu' et prenom 'ISABELLE' et email 'isabelle@hotmail.com'
    And   Selectioner le button validation de la proposition
    Then  Recuperer la numero du proposition et du dossier
    Given Cliquer sur espace Dossier
    When  Chercher le dossier d'assurance deja crée
    Then  Verifier l'affichage le numéro du dossier


  @Creation_Proposition_par_siret
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
    And   Entrer la Siret de l entreprise "21750001600019"
    And   Cliquer sur le formulaire de Siret
    And   Cliquer sur calculer
    Then  Les trois formules s'affiche
    Given Choisir la formule correpandante
    When  Recuperer les informations de la formule
    And   Selectioner les options que vous souhaitez
    And   Selectionner la formule
    Then  Redirection vers la page de synthese de proposition
    Given La page de synthese affiche  recuperation des informations de formule
    When  Entrer les info de signataire nom 'Sirigu' et prenom 'ISABELLE' et email 'isabelle@hotmail.com'
    And   Selectioner le button validation de la proposition
    Then  Recuperer la numero du proposition et du dossier
    Given Cliquer sur espace Dossier
    When  Chercher le dossier d'assurance deja crée
    Then  Verifier l'affichage le numéro du dossier



