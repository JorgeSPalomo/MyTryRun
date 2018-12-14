package com.syntax.cucumverproject.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Features"}
		, glue= {"src/test/java/StepDefinitions"}
		, plugin =  {"pretty", "html:test-output"}
		, dryRun = true
		, monochrome = true)
		


public class LoginRunner {

}
