package com.e2etests.automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {

    @After
    public void quitDriver(Scenario scenario) {

        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) Setup.driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "screenshot");
        }
        Setup.driver.quit();

    }
}
