package com.ranford.pagelibrary;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions; 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="folder",glue= {"com.ranford.pagelibrary"})
public class Runner 
{

	
	
	
}
