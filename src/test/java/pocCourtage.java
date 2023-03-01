import java.time.Duration;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class pocCourtage {


        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        JavascriptExecutor js;
        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "https://www.google.com/";
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

            driver.manage().window().maximize();
            js = (JavascriptExecutor) driver;
        }

        @Test
        public void CreationProposition() throws Exception {
            driver.get("https://recette.spherianet.fr/");
            driver.findElement(By.id("edit-name")).sendKeys("admin@spheria.com");
            driver.findElement(By.id("edit-pass")).sendKeys("Password2022*");
            driver.findElement(By.xpath("//button[@id='edit-submit']/span")).click();

            driver.findElement(By.id("edit-produit")).click();
            Select produit = new Select(driver.findElement(By.id("edit-produit")));
            produit.selectByVisibleText("PERFORM MA SANTE COLLECTIVE");

            driver.findElement(By.cssSelector("[id^='edit-groupe-']")).click();
            Select groupe = new Select(driver.findElement(By.cssSelector("[id^='edit-groupe-']")));
            groupe.selectByVisibleText("PREVERE");

            driver.findElement(By.xpath("//option[contains(text(),'FARGENT Angélique')]")).click();

            Thread.sleep(1000);
            WebElement element = driver.findElement(By.cssSelector("[id^='edit-submit--']"));
            element.click();

            driver.findElement(By.id("edit-criteres-departments")).click();
            new Select(driver.findElement(By.id("edit-criteres-departments"))).selectByVisibleText("75 - Paris");

            driver.findElement(By.xpath("//div[@id='edit_criteres_college_chosen']/a/span")).click();
            driver.findElement(By.xpath("//div[@id='edit_criteres_college_chosen']/div/ul/li[2]")).click();

            driver.findElement(By.id("edit-criteres-tranche-d-age")).click();
            new Select(driver.findElement(By.id("edit-criteres-tranche-d-age"))).selectByVisibleText("18-39");

            driver.findElement(By.id("edit-criteres-taux-de-comm")).click();
            new Select(driver.findElement(By.id("edit-criteres-taux-de-comm"))).selectByVisibleText("5 %");

            driver.findElement(By.id("edit-criteres-structure")).click();
            new Select(driver.findElement(By.id("edit-criteres-structure"))).selectByVisibleText("Isolé Famille");

            driver.findElement(By.id("edit_conventions_collectives_chosen")).click();
            driver.findElement(By.cssSelector("#edit_conventions_collectives_chosen > a")).click();
            driver.findElement(By.xpath("//div[@id='edit_conventions_collectives_chosen']/div/ul/li[contains(text(), 'Je ne sais pas')]")).click();

            driver.findElement(By.id("edit-field-de-date-effet-0")).click();
            driver.findElement(By.linkText("1")).click();

          //  en cas de pb
//            driver.findElement(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-ndeg-siret-0-value\"]")).sendKeys("22730001900014");
//            //Thread.sleep(10);
//            driver.findElement(By.id("drupal-modal--content")).click();
//            driver.findElement(By.cssSelector("[id^='insee-modal-form-']")).click();
//            driver.findElement(By.cssSelector("[id^='edit-confirm-']")).click();
//            driver.findElement(By.xpath("//*[@id='edit-calculer']")).click();
//            String messageErreur= driver.findElement(By.cssSelector("[id^='edit-results-container-']")).getText();
//            //System.out.println(""+messageErreur);
//              Assert.assertEquals("Le code postal ne correspond pas au département choisi.\n", messageErreur);


            //sinon
            driver.findElement(By.xpath("//div[@id='edit-field-de-sante-0-inline-entity-form-field-des-nvlle-entreprise-wrapper']/div/label")).click();
            driver.findElement(By.id("edit-field-de-sante-0-inline-entity-form-field-des-raison-sociale-0-value")).sendKeys("testzero");
            driver.findElement(By.xpath("//*[@id='edit-calculer']")).click();

            driver.findElement(By.cssSelector("[id^='edit-0-']")).click();
            String isolePourcent = driver.findElement(By.cssSelector("[id^='edit-pmss-container-']")).getText();
            System.out.println("Formule1 : Isolé Pourcentage"+isolePourcent);
            String isolePrix = driver.findElement(By.cssSelector("[id^='edit-tarif-container-']")).getText();
            System.out.println("Formule1 : Isolé Tarif"+isolePrix);

            driver.findElement(By.cssSelector("[id^='edit-0-']")).click();

            WebElement btnSelectionnerOption = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='dropdown_options_1876009']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnSelectionnerOption);

            driver.findElement(By.cssSelector("[id^='edit-dropdown-options-1876002-']")).click();

            WebElement btnSelectionner = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Sélectionner']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnSelectionner);

            WebElement btnSuivant = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Suivant']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",btnSuivant);
            btnSuivant.click();

            String raisonSociale = driver.findElement(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-raison-sociale-0\"]/span")).getText();
            System.out.println("la raison Sociale : "+ raisonSociale);
            String entreprise = driver.findElement(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-nvlle-entreprise-0\"]/span\n")).getText();
            System.out.println("Entreprise en cours de création : "+ entreprise);
            String college =  driver.findElement(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-colleges\"]/span")).getText();
            System.out.println("Collège  : "+ college);
            String isolé =  driver.findElement(By.xpath("//*[@id=\"bootstrap-panel\"]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div\n")).getText();
            System.out.println("Isolee  : "+ isolé);

             driver.findElement(By.xpath("//input[@id='edit-field-de-sante-0-inline-entity-form-field-des-signataire-nom-0-value']\n")).sendKeys("Sirigu");
             driver.findElement(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-signataire-prenom-0-value\"]\n")).sendKeys("ISABELLE");
             driver.findElement(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-signataire-email-0-value\"]\n")).sendKeys("safa@hotmail.com");
             driver.findElement(By.xpath("//button[@id='edit-next']")).click();

            String strProp =  driver.findElement(By.xpath("//*[@id=\"edit-propositions\"]/div/p[1]")).getText();
            String numProposition = strProp.substring(20,30);
            System.out.println("Numero du Proposition Commerciale  : "+ numProposition);

            String strDoss =  driver.findElement(By.xpath("//*[@id=\"edit-propositions\"]/div/p[2]")).getText();
            String numDossier = strDoss.substring(3,12);
            System.out.println("Numero du dossier  : "+ numDossier);

            driver.findElement(By.xpath("//*[@id=\"block-svie-main-menu\"]/ul/li[2]/a")).click();
            driver.findElement(By.xpath("//*[@id=\"block-svie-main-menu\"]/ul/li[2]/ul/li[2]/a")).click();
            driver.findElement(By.xpath(" //*[@id=\"edit-title\"]")).sendKeys(numDossier);
            driver.findElement(By.xpath("//button[@id='edit-submit-svie-liste-dossiers-assurance']")).click();



        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            String verificationErrorString = verificationErrors.toString();
            if (!"".equals(verificationErrorString)) {
                fail(verificationErrorString);
            }
        }

        private boolean isElementPresent(By by) {
            try {
                driver.findElement(by);
                return true;
            } catch (NoSuchElementException e) {
                return false;
            }
        }

        private boolean isAlertPresent() {
            try {
                driver.switchTo().alert();
                return true;
            } catch (NoAlertPresentException e) {
                return false;
            }
        }

        private String closeAlertAndGetItsText() {
            try {
                Alert alert = driver.switchTo().alert();
                String alertText = alert.getText();
                if (acceptNextAlert) {
                    alert.accept();
                } else {
                    alert.dismiss();
                }
                return alertText;
            } finally {
                acceptNextAlert = true;
            }
        }
    }


