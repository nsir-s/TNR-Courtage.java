package com.e2etests.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static Logger log= LogManager.getLogger();
    public WebDriverWait wait;

    protected WebDriver driver;

    public BasePage() {
        this.driver = Setup.driver;
    }

}
