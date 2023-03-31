package com.e2etests.automation.utils;

import fr.sihm.tnr.enumr.Navigateurs;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Setup {

    public static WebDriver driver;
   // public VideoRecord videoRecord = new VideoRecord();
    protected Navigateurs myNavigateur;
    protected String pathNameVideos;



    @Before
    public void setWebDriver() throws Exception {


//        myNavigateur = Browser.IdentBrowser("chrome");
//        driver = Browser.browserLaunch(myNavigateur, pathNameVideos, false);


        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver",  "src/test/resources/chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("['start-maximized']");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" is not supported.");


        }
        //videoRecord.startRecording("TestEntreprise","D:\\projets\\TNR\\video-Courtage");
    }
}
