import fr.sihm.tnr.report.VideoRecord;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.fail;


public class PocCourtageEntreprise {

        private WebDriver driver;
        private String baseUrl;
        private boolean acceptNextAlert = true;
        private StringBuffer verificationErrors = new StringBuffer();
        public VideoRecord videoRecord = new VideoRecord();
        JavascriptExecutor js;
        @Before
        public void setUp() throws Exception {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();
            baseUrl = "https://www.google.com/";
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
            driver.manage().window().maximize();
            js = (JavascriptExecutor) driver;
            videoRecord.startRecording("TestEntreprise","D:\\projets\\TNR\\video-Courtage");

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
            WebDriverWait w1 = new WebDriverWait(driver, Duration.ofSeconds(60));

            driver.findElement(By.xpath("//div[@id='edit_criteres_college_chosen']/a/span")).click();
            driver.findElement(By.xpath("//div[@id='edit_criteres_college_chosen']/div/ul/li[2]")).click();
            WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));

            driver.findElement(By.id("edit-criteres-tranche-d-age")).click();
            new Select(driver.findElement(By.id("edit-criteres-tranche-d-age"))).selectByVisibleText("18-39");
            WebDriverWait w2 = new WebDriverWait(driver, Duration.ofSeconds(60));

            driver.findElement(By.id("edit-criteres-taux-de-comm")).click();
            new Select(driver.findElement(By.id("edit-criteres-taux-de-comm"))).selectByVisibleText("5 %");
            WebDriverWait w3 = new WebDriverWait(driver, Duration.ofSeconds(60));

            driver.findElement(By.id("edit-criteres-structure")).click();
            new Select(driver.findElement(By.id("edit-criteres-structure"))).selectByVisibleText("Isolé Famille");
            WebDriverWait w4 = new WebDriverWait(driver, Duration.ofSeconds(60));

            driver.findElement(By.id("edit_conventions_collectives_chosen")).click();
            driver.findElement(By.cssSelector("#edit_conventions_collectives_chosen > a")).click();
            driver.findElement(By.xpath("//div[@id='edit_conventions_collectives_chosen']/div/ul/li[contains(text(), 'Je ne sais pas')]")).click();

            driver.findElement(By.id("edit-field-de-date-effet-0")).click();
            driver.findElement(By.linkText("1")).click();

            driver.findElement(By.xpath("//div[@id='edit-field-de-sante-0-inline-entity-form-field-des-nvlle-entreprise-wrapper']/div/label")).click();
            driver.findElement(By.id("edit-field-de-sante-0-inline-entity-form-field-des-raison-sociale-0-value")).sendKeys("testzero");
            driver.findElement(By.xpath("//*[@id='edit-calculer']")).click();

            driver.findElement(By.cssSelector("[id^='edit-0-']")).click();
            String isolePourcent = driver.findElement(By.cssSelector("[id^='edit-pmss-container-']")).getText();
            System.out.println("Formule1 : Isolé Pourcentage" +" "+ isolePourcent);
            String isolePrix = driver.findElement(By.cssSelector("[id^='edit-tarif-container-']")).getText();
            System.out.println("Formule1 : Isolé Tarif"+" "+ isolePrix);

            driver.findElement(By.cssSelector("[id^='edit-0-']")).click();

            WebElement btnSelectionnerOption = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='dropdown_options_1876009']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnSelectionnerOption);

            driver.findElement(By.cssSelector("[id^='edit-dropdown-options-1876002-']")).click();

            WebElement btnSelectionner = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Sélectionner']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnSelectionner);

            WebElement btnSuivant = new WebDriverWait(driver, Duration.ofSeconds(50))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Suivant']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",btnSuivant);
            btnSuivant.click();

            Thread.sleep(1000);

            WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(60));

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
            WebElement RS = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"edit-field-de-sante-0-inline-entity-form-field-des-raison-sociale-0\"]/span")));
            String raisonSociale = RS.getText();
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
            WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(100));

            driver.findElement(By.xpath(" //*[@id=\"edit-title\"]")).sendKeys(numDossier);
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(100));

            WebElement btnChercherDos = new WebDriverWait(driver, Duration.ofSeconds(30))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='edit-submit-svie-liste-dossiers-assurance']")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();",btnChercherDos);

            WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(100));
            Thread.sleep(1000);
            WebElement Dos = new WebDriverWait(driver, Duration.ofSeconds(50))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'N° de dossier:')]")));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",Dos);
            Thread.sleep(1000);
            Dos.click();




        }

        @After
        public void tearDown() throws Exception {
            driver.quit();
            videoRecord.stopRecording();

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


