package com.e2etests.automation.proposition.stepDefinition;

import com.e2etests.automation.proposition.pageObjects.CreationPropositionPage;
import com.e2etests.automation.utils.CommonUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

public class CreationPropositionStepDefinition {


    private static String dossier;

    CommonUtils commonUtils;
    CreationPropositionPage creationPropositionPage;

    public CreationPropositionStepDefinition() {
        this.creationPropositionPage = new CreationPropositionPage();
        this.commonUtils = new CommonUtils();
    }


    @Given("Lancer Spheria")
    public void lancerSpheria() throws IOException {
        commonUtils.getUrl("home.url");
    }

    @When("Se connecter sur Spheria avec les identifiants {string} et {string}")
    public void seConnecterSurSpheria(String name, String password) {
        creationPropositionPage.fillUserName(name);
        creationPropositionPage.fillPassword(password);
        creationPropositionPage.clickOnLogin();
    }

    @And("Remplir la formulaire de tarification en selectionner le projet {string}")
    public void remplirLaFormulaireDeTarificationEnSelectionnerLeProjet(String projet) {
        creationPropositionPage.clickOnProduit(projet);
    }

    @And("Choisir le groupe de courtier {string}")
    public void choisirLeGroupeDeCourtier(String gprCourtage) throws InterruptedException {
        creationPropositionPage.clickOnGrpCourtage(gprCourtage);
    }

    @And("Selectionner le courtier {string}")
    public void selectionnerLeCourtier(String courtier) throws InterruptedException {
        creationPropositionPage.clickOnCourtier(courtier);
    }

    @And("Le formulaire de simulateur affiche en cliquant sur le bouton selectionner")
    public void leFormulaireDeSimulateurAfficheEnCliquantSurLeBoutonSelectionner() throws InterruptedException {
        creationPropositionPage.clickOnSelectionnerPourTarifier();
    }

    @Given("Le formulaire de simulateur affiche")
    public void leFormulaireDeSimulateurAffiche() {

    }

    @When("Remplir la formulaire des elements du calculateur en selectionner le departement {string}")
    public void remplirLaFormulaireDesElementsDuCalculateurEnSelectionnerLeDepartementParis(String departementSelect) throws InterruptedException {
        creationPropositionPage.selectionnerDepartement(departementSelect);
    }

    @And("Selectionner le college {string}")
    public void selectionnerLeCollegeEnsembleDuPersonnel(String collegeSelect) throws InterruptedException {
        creationPropositionPage.selectionnerCollege(collegeSelect);
    }

    @And("Selectionner  le tranche d age {string}")
    public void selectionnerLeTrancheDAge(String trancheAge) {
        creationPropositionPage.selectionnerLeTrancheDAge(trancheAge);
    }

    @And("Selectionner le taux de comm {string}")
    public void selectionnerLeTauxDeComm(String tauxCom) {
        creationPropositionPage.selectionnerLeTauxComm(tauxCom);

    }

    @And("Selectionner la structure tarifaire {string}")
    public void selectionnerLaStructureTarifaireIsoléFamille(String structureTarifaire) {
        creationPropositionPage.selectionnerLaStructureTarifaire(structureTarifaire);

    }

    @And("Selectionner la IDCC {string}")
    public void selectionnerLaIDCCJeNeSaisPas(String conventionCollective) {
        creationPropositionPage.selectionnerLaConventionCollective(conventionCollective);
    }


    @And("Selectionner la date d effet {string}")
    public void selectionnerLaDateDEffet(String date) {
        creationPropositionPage.selectionnerLaDateEffet(date);
    }

    @And("Cliquer sur ENTREPRISE EN COURS DE CREATION")
    public void cliquerSurENTREPRISEENCOURSDECREATION() {
        creationPropositionPage.clickOnEntreprise();
    }

    @And("Entrer la raison sociale d une entreprise {string}")
    public void entrerLaRaisonSocialeDUneEntrepriseHarmonieMutuelleCourtageParis(String RaisonSocialeEntreprise) {
        creationPropositionPage.fullEntreprise(RaisonSocialeEntreprise);
    }

    @And("Cliquer sur calculer")
    public void cliquerSurCalculer() {
        creationPropositionPage.clickOnCalculer();
    }

    @Then("Les trois formules s'affiche")
    public void lesTroisFormulesSAffiche() {
    }

    @Given("Choisir la formule correpandante")
    public void choisirLaFormuleCorrepandante() {
        creationPropositionPage.clickOnFormule();
    }

    @When("Recuperer les informations de la formule")
    public void recupererLesInformationsDeLaFormule() {
        creationPropositionPage.getInfoFormule();
    }

    @And("Selectioner les options que vous souhaitez")
    public void selectionerLesOptionsQueVousSouhaitez() {
        creationPropositionPage.clickOnOption();
    }

    @And("Selectionner la formule")
    public void selectionnerLaFormule() {
        creationPropositionPage.clickOnFormuleChoisi();
    }

    @Then("Redirection vers la page de synthese de proposition")
    public void redirectionVersLaPageDeSyntheseDeProposition() {
        creationPropositionPage.clickSuivant();
    }

    @Given("La page de synthese affiche  recuperation des informations de formule")
    public void laPageDeSyntheseAfficheRecuperationDesInformationsDeFormule() {
        creationPropositionPage.getInfoEntreprise();
    }

    @When("Entrer les info de signataire nom {string} et prenom {string} et email {string}")
    public void entrerLesInfoDeSignataireNomSiriguEtPrenomEtEmail(String nom, String prenom, String email) {
        creationPropositionPage.fullInfoSignataire(nom, prenom, email);
    }

    @And("Selectioner le button validation de la proposition")
    public void selectionerLeButtonValidationDeLaProposition() {
        creationPropositionPage.clickEditProposition();
    }

    @Then("Recuperer la numero du proposition et du dossier")
    public void recupererLaNumeroDuPropositionEtDuDossier() {
        dossier = creationPropositionPage.getNumDossier();
    }

    @Given("Cliquer sur espace Dossier")
    public void cliquerSurEspaceDossier() {
        creationPropositionPage.clickOnEspaceDossier();
    }


    @Then("Verifier l'affichage le numéro du dossier")
    public void verifierLAffichageLeNuméroDuDossier() {
        creationPropositionPage.verifNumDossier();
    }


    @When("Chercher le dossier d'assurance deja crée")
    public void chercherLeDossierDAssuranceDejaCrée() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>" + dossier);
        creationPropositionPage.searchDossier(dossier);
    }

    @And("Entrer la Siret de l entreprise {string}")
    public void entrerLaSiretDeLEntreprise(String siret) throws Exception {
        creationPropositionPage.fullSiret(siret);
    }

    @Then("Verifier la Siret")
    public void verifierLaSiret() {
        creationPropositionPage.verifSiret();
    }

    @Then("La Siret ne correspand pas au departement")
    public void laSiretNeCorrespandPasAuDepartement() {
        creationPropositionPage.verifSiretDepartment();
    }

    @And("Cliquer sur le formulaire de Siret")
    public void cliquerSurLeFormulaireDeSiret() {
        creationPropositionPage.clickOnConfirmerSiret();
    }
}


