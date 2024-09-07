package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\resources\\Features"
        ,glue = {"covidStepDefinitions","covidSteps"}
        ,plugin = {"pretty","html:target/cucumber-reports.html"}
        ,monochrome = true,
        tags = "@covidfeature")


public class TestRunner  {


}

