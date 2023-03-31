package com.e2etests.automation.proposition.pageObjects;

import com.e2etests.automation.utils.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static com.e2etests.automation.utils.Setup.driver;

public class CreationPropositionPage {
    protected static Logger log = LogManager.getLogger();
    CommonUtils commonUtils;

    public CreationPropositionPage() {
        PageFactory.initElements(driver, this);

    }

    /*@FindBy*/
    @FindBy(how = How.ID, using = "edit-name")
    public static WebElement username;

    @FindBy(how = How.ID, using = "edit-pass")
    public static WebElement userpassword;

    @FindBy(how = How.XPATH, using = "//button[@id='edit-submit']/span")
    public static WebElement loginBtn;

    @FindBy(how = How.ID, using = "edit-produit")
    public static WebElement produitBtn;

    @FindBy(how = How.CSS, using = "[id^='edit-groupe-']")
    public static WebElement grpCourtageBtn;

    @FindBy(how = How.CSS, using = "[id^='edit-user-']")
    public static WebElement courtierBtn;

    @FindBy(how = How.CSS, using = "[id^='edit-submit--']")
    public static WebElement selectionnerBtn;

    @FindBy(how = How.ID, using = "edit-criteres-departments")
    public static WebElement departement;

    @FindBy(how = How.XPATH, using = "//div[@id='edit_criteres_college_chosen']/a/span")
    public static WebElement college;

    @FindBy(how = How.XPATH, using = "//div[@id='edit_criteres_college_chosen']/div/ul/li[2]")
    public static WebElement collegeBtn;

    @FindBy(how = How.ID, using = "edit-criteres-tranche-d-age")
    public static WebElement trancheAge;

    @FindBy(how = How.ID, using = "edit-criteres-taux-de-comm")
    public static WebElement tauxComm;

    @FindBy(how = How.ID, using = "edit-criteres-structure")
    public static WebElement structureTarifaire;

    @FindBy(how = How.ID, using = "edit_conventions_collectives_chosen")
    public static WebElement conventionColl;

    @FindBy(how = How.XPATH, using = "//div[@id='edit_conventions_collectives_chosen']/div/ul/li[contains(text(), 'Je ne sais pas')]")
    public static WebElement conventionCollOneClick;

    @FindBy(how = How.CSS, using = "#edit_conventions_collectives_chosen > a")
    public static WebElement conventionCollTwoClick;

    @FindBy(how = How.ID, using = "edit-field-de-date-effet-0")
    public static WebElement dateEffet;

    @FindBy(how = How.LINK_TEXT, using = "1")
    public static WebElement dateEffetClick;

    @FindBy(how = How.XPATH, using = "//div[@id='edit-field-de-sante-0-inline-entity-form-field-des-nvlle-entreprise-wrapper']/div/label")
    public static WebElement entrepriseBtn;

    @FindBy(how = How.ID, using = "edit-field-de-sante-0-inline-entity-form-field-des-raison-sociale-0-value")
    public static WebElement entrepriseRaisonSociale;

    @FindBy(how = How.ID, using = "edit-calculer")
    public static WebElement calculerBtn;

    @FindBy(how = How.CSS, using = "[id^='edit-0-']")
    public static WebElement formuleBtn;

    @FindBy(how = How.CSS, using = "[id^='edit-pmss-container-']")
    public static WebElement isolePourcentage;

    @FindBy(how = How.CSS, using = "[id^='edit-tarif-container-']")
    public static WebElement isoleTarif;

    @FindBy(how = How.CSS, using = "[id^='edit-dropdown-options-1876002--']")
    public static WebElement optionBtnSelect;

    @FindBy(how = How.XPATH, using = "//button[@id='dropdown_options_1876009']")
    public static WebElement optionBtn;

    @FindBy(how = How.XPATH, using = "//button[@value='Sélectionner']")
    public static WebElement formuleSelect;

    @FindBy(how = How.XPATH, using = "//button[@value='Suivant']")
    public static WebElement suivantBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-raison-sociale-0\"]/span")
    public static WebElement raisonSociale;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-nvlle-entreprise-0\"]/span")
    public static WebElement entreprise;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-colleges\"]/span\n")
    public static WebElement collegeRecap;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-colleges\"]/span\n")
    public static WebElement isole;

    @FindBy(how = How.XPATH, using = "//input[@id='edit-field-de-sante-0-inline-entity-form-field-des-signataire-nom-0-value']")
    public static WebElement signataireNom;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-signataire-prenom-0-value\"]\n")
    public static WebElement sigantairePrenom;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-signataire-email-0-value\"]\n")
    public static WebElement sigantaireEmail;

    @FindBy(how = How.XPATH, using = "//button[@id='edit-next']")
    public static WebElement signataireEdit;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-propositions\"]/div/p[1]")
    public static WebElement propositionNum;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-propositions\"]/div/p[2]")
    public static WebElement dossierNum;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-svie-main-menu\"]/ul/li[2]/a")
    public static WebElement espaceDossierBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"block-svie-main-menu\"]/ul/li[2]/ul/li[2]/a")
    public static WebElement listeDossierBtn;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-title\"]")
    public static WebElement numDossierEdit;

    @FindBy(how = How.XPATH, using = "//button[@id='edit-submit-svie-liste-dossiers-assurance']")
    public static WebElement rechercheDossierBtn;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'N° de dossier:')]")
    public static WebElement dossierVerif;

    @FindBy(how = How.XPATH, using = "//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-ndeg-siret-0-value\"]")
    public static WebElement siretEntreprise;

    @FindBy(how = How.ID, using = "edit-field-de-sante-0-inline-entity-form")
    public static WebElement clickFormulaireBtn;

    @FindBy(how = How.ID, using = "drupal-modal--content")
    public static WebElement popUpSiret;

    @FindBy(how = How.CSS, using = "[id^='insee-modal-form-']")
    public static WebElement popUpSiretBtn;

    @FindBy(how = How.CSS, using = "[id^='edit-confirm-']")
    public static WebElement confirmerPopupBtn;

    @FindBy(how = How.CSS, using = " [id^='edit-results-container-']")
    public static WebElement resultatCalcul;

    @FindBy(how = How.ID, using = "siret-error")
    public static WebElement msgErreur;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'N° de dossier:')]")
    public static WebElement dossier;


    /*Methods*/

    public static void mySelects(WebElement webElement, String string) {
        webElement.click();
        new Select(webElement).selectByVisibleText(string);
        webElement.click();
    }

    public void waitElementToBeClickable(WebElement webElement, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

    public void waitVisibilityOf(WebElement webElement, long timeout) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void fillUserName(String name) {
        username.sendKeys(name);
    }

    public void fillPassword(String password) {
        userpassword.sendKeys(password);
    }

    public void clickOnLogin() {
        loginBtn.click();
    }

    public void clickOnProduit(String projet) {
        mySelects(produitBtn, projet);
    }

    public void clickOnGrpCourtage(String gprCourtage) throws InterruptedException {
        waitElementToBeClickable(grpCourtageBtn, 10);
        mySelects(grpCourtageBtn, gprCourtage);
    }

    public void clickOnCourtier(String courtier) throws InterruptedException {
        waitElementToBeClickable(courtierBtn, 10);
        mySelects(courtierBtn, courtier);
    }

    public void clickOnSelectionnerPourTarifier() throws InterruptedException {
        waitElementToBeClickable(selectionnerBtn, 10);
        selectionnerBtn.click();
    }

    public void selectionnerDepartement(String departementSelect) throws InterruptedException {
        waitElementToBeClickable(departement, 10);
        mySelects(departement, departementSelect);
    }


    public void selectionnerCollege(String collegeSelect) throws InterruptedException {
        waitElementToBeClickable(college, 10);
        college.click();
        collegeBtn.click();
    }


    public void selectionnerLeTrancheDAge(String trancheAgeSelect) {
        waitElementToBeClickable(trancheAge, 10);
        mySelects(trancheAge, trancheAgeSelect);
    }


    public void selectionnerLeTauxComm(String tauxComSelect) {
        waitElementToBeClickable(tauxComm, 10);
        mySelects(tauxComm,tauxComSelect);
    }

    public void selectionnerLaStructureTarifaire(String structureTarifaireSelect) {
        waitElementToBeClickable(structureTarifaire, 10);
        mySelects(structureTarifaire,structureTarifaireSelect);
    }

    public void selectionnerLaConventionCollective(String conventionSelect) {
        waitElementToBeClickable(conventionColl, 50);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", conventionColl);
        conventionColl.click();
        conventionCollTwoClick.click();
        conventionCollOneClick.click();
    }

    public void selectionnerLaDateEffet(String date) {
        waitElementToBeClickable(dateEffet, 100);
        dateEffet.click();
        dateEffetClick.click();
    }

    public void clickOnEntreprise() {
        entrepriseBtn.click();
    }

    public void fullEntreprise(String RsEntreprise) {
        entrepriseRaisonSociale.sendKeys(RsEntreprise);
    }

    public void clickOnCalculer() {
        calculerBtn.click();
    }

    public void clickOnFormule() {
        waitElementToBeClickable(formuleBtn, 100);
        formuleBtn.click();
    }

    public void getInfoFormule() {
        System.out.println("Formule  : Isolé Pourcentage" + " : " + isolePourcentage.getText());
        System.out.println("Formule  : Isolé Tarif" + " : " + isoleTarif.getText());
    }

    public void clickOnOption() {
        waitElementToBeClickable(optionBtn, 100);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", optionBtn);
        optionBtnSelect.click();
    }


    public void clickOnFormuleChoisi() {
        waitElementToBeClickable(formuleSelect, 100);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", formuleSelect);
    }

    public void clickSuivant() {
        waitElementToBeClickable(suivantBtn, 50);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", suivantBtn);
        suivantBtn.click();
    }

    public void getInfoEntreprise() {
        waitElementToBeClickable(raisonSociale, 50);
        System.out.println("la raison Sociale : " + raisonSociale.getText());
        System.out.println("Entreprise en cours de création : " + entreprise.getText());
        System.out.println("Collège  : " + collegeRecap.getText());
        System.out.println("Isolee  : " + isole.getText());

    }


    public void fullInfoSignataire(String nom, String prenom, String email) {
        signataireNom.sendKeys(nom);
        sigantairePrenom.sendKeys(prenom);
        sigantaireEmail.sendKeys(email);
    }


    public void clickEditProposition() {
        signataireEdit.click();
    }


    public static String getNumDossier() {
        String strProp = propositionNum.getText();
        String numProposition = strProp.substring(20, 30);
        System.out.println("Numero du Proposition Commerciale  : " + numProposition);

        String strDoss = dossierNum.getText();
        String numDossier = strDoss.substring(3, 12);
        System.out.println("Numero du dossier  : " + numDossier);

        return numDossier;
    }

    public void clickOnEspaceDossier() {
        espaceDossierBtn.click();
        listeDossierBtn.click();
    }


    public void searchDossier(String dossier) {
        numDossierEdit.sendKeys(dossier);
        rechercheDossierBtn.click();
    }

    public void fullSiret(String siret) throws Exception {
        siretEntreprise.sendKeys(siret);
        clickFormulaireBtn.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void verifSiret() {
        String erreur = msgErreur.getText();
        Assert.assertEquals("Le numéro SIRET saisi n'est pas valide.", erreur);
        System.out.println("Erreur : " + erreur);
    }

    public void verifSiretDepartment() {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        if (resultatCalcul.getText().contains("Le code postal ne correspond pas au département choisi")) {
            String error = resultatCalcul.getText();
            Assert.assertEquals("×\n" +
                    "Message d'erreur\n" +
                    "Le code postal ne correspond pas au département choisi.", error);
            System.out.println("Erreur : " + error);
        }
    }

    public void clickOnConfirmerSiret() {
        popUpSiret.click();
        System.out.println("Format de SIRET valide !");
        popUpSiretBtn.click();
        confirmerPopupBtn.click();
    }

    public void verifNumDossier() {
        new WebDriverWait(driver, Duration.ofSeconds(50))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'N° de dossier:')]")));
        Assert.assertEquals("N° de dossier:", dossier.getText());
    }
}
