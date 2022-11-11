package org.runnerclass;



import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilities.JvmReports;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\",
glue= {"org.stepdefinitionclass"},
dryRun=false,
plugin= {"html:target\\Reports","junit:target\\Reports\\cloud.xml","json:target\\Reports\\cloud.json"})           

 public class RunnerClas {
	

	@AfterClass
	public static void TestRunnerclass() {
		
		JvmReports.generateJvmReports(System.getProperty("user.dir")+"\\target\\Reports\\cloud.json");

	}
	


	
	
	
	
	
	
  
	


}  
