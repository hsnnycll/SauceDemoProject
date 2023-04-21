package com.saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json",
        },
        features = "src/test/resources",
        glue = "com/saucedemo/stepDefinitions",
        tags = "@smoke"
)


public class CukesRunner {
}
