package com.saucedemo.stepDefinitions;


import com.saucedemo.utilities.ConfigurationReader;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

    @Before
    public void setup(Scenario scenario){
        System.out.println(":::::::::TEST INFORMATION:::::::::");
        System.out.println("Browser :: " + ConfigurationReader.getProperty("browser"));
        System.out.println("URL :: " + ConfigurationReader.getProperty("url"));
        System.out.println("Environment :: " + ConfigurationReader.getProperty("environment"));
        System.out.println("Test Scenario :: " + scenario.getName());
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }
}
