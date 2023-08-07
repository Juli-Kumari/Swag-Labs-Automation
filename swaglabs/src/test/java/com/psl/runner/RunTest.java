package com.psl.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/", glue = { "com.psl.common",
		"com.psl.stepdefinitions" }, 
tags = "", monochrome = true, 
plugin = { "pretty",
				"json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumber.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })

public class RunTest extends AbstractTestNGCucumberTests {

}
