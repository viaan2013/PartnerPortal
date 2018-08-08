package com.CucumberRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C://Users//Sruthi.Kundoor//eclipse-workspace//ScenariosToAutomate//src//test//resources//features",
		glue= {"com.StepDefination"},
		tags= {"~@Courseonline","~@ProductProgression","~@Newoutcome","~@RemovingEntryrequirements","@AddingEntryrequirements"},
		plugin= {"pretty:target/cucumber-pretty.txt",
				 "junit:target/cucumber-results.xml",
				 "html:target/cucumber-html-report",
				 "json:target/cucumber.json",
				 "usage:target/cucumber-usage.json"}
		)


public class CucucmberRunner {
	
	

}
