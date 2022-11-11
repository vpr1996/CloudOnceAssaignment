package org.utilities;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class JvmReports {

	
	
	public static void generateJvmReports(String jsonpath) {
	
		File f = new File(System.getProperty("user.dir")+"\\target\\Reports\\JvmReports");
		
		
		Configuration con = new Configuration(f, "cloudonce");
	
		con.addClassifications("platform ","win 7");
		con.addClassifications("projectname","CloudOnce");
		
		
		List<String>li= new ArrayList<>();
		li.add(jsonpath);
		
		ReportBuilder rb = new ReportBuilder(li, con);
		rb.generateReports();
		

	}
		
		
	}

