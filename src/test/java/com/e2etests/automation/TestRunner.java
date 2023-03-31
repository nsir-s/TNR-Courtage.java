package com.e2etests.automation;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/spec/features/creationProposition"},
        tags = "@Creation_Proposition_par_raison_sociale",
        glue = "",
        plugin = {"pretty", "json:target/reports_Courtage/cucumber_report.json"}
)


public class TestRunner {

}