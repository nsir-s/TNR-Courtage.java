package com.e2etests.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/spec/features/authentification"},
        tags = "@Authentifier",
        glue = "",
        plugin = {"pretty", "json:target/reports_Courtage/cucumber_report.json"}
)


public class TestRunner {

}