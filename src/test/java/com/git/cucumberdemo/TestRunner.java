package com.git.cucumberdemo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@ContextConfiguration("Cucumber.xml")
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:", plugin = {"pretty"})
public class TestRunner {
	
}
