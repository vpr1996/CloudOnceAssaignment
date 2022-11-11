package org.stepdefinitionclass;

import java.io.IOException;

import org.utilities.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	
	@After
	public  void failedScreenshot(Scenario s) throws IOException {
		
		String s1= s.getName();
		String str = s1.replace(" ","_");
		if (s.isFailed()) {
			
			screenshots(str);
		}
	
		
	}
	
	
	
	
	
	
	
}
