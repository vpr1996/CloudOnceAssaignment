package org.stepdefinitionclass;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pojoClass.PojoCreateNewUser;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefineClass extends BaseClass {

	

@Given("User should launch the browser and maximize the window")
public void user_should_launch_the_browser_and_maximize_the_window() {

	launchChrome();
	maximum();
	
}

@When("User should load the url")
public void user_should_load_the_url() {
   
	gett("https://test-elms.cloudnowtech.net/");
}

@When("User should give Email and password and click signin button")
public void user_should_give_Email_and_password_and_click_signin_button() throws IOException {
    
	implicitwaits();
	PojoCreateNewUser pj = new PojoCreateNewUser();
	sendkey(pj.getEmailid(),getdataxlsheet(1,0));
	sendkey(pj.getPassword(),getdataxlsheet(1,1));
	clicks(pj.getSignin());
}

@When("User should click users icon on left side of the webpage")
public void user_should_click_users_icon_on_left_side_of_the_webpage() {
	implicitwaits();
	PojoCreateNewUser pj = new PojoCreateNewUser();
	javascriptclick(pj.getUsers());
	
}

@When("User should click add button on top right")
public void user_should_click_add_button_on_top_right() {
	implicitwaits();
	PojoCreateNewUser pj = new PojoCreateNewUser();
	clicks(pj.getAdd());
}
    

@When("User should fill all the details and click submit")
public void user_should_fill_all_the_details_and_click_submit() throws IOException {
	implicitwaits();
	PojoCreateNewUser pj = new PojoCreateNewUser();
	
	dropdownselectbyvisibletext(pj.getOrganisation(),getdataxlsheet(1, 2));
	dropdownselectbyvisibletext(pj.getRole(), getdataxlsheet(1,3));
	sendkey(pj.getFirstname(),getdataxlsheet(1,4));
	sendkey(pj.getLastname(), getdataxlsheet(1,5));
	sendkey(pj.getEmailids(), getdataxlsheet(1,6));
	sendkey(pj.getDescription(),getdataxlsheet(1,7));
	sendkey(pj.getAddress(),getdataxlsheet(1,8));
	sendkey(pj.getCity(),getdataxlsheet(1,9));
	sendkey(pj.getCountry(),getdataxlsheet(1,10));
	sendkey(pj.getLandline(),getdataxlsheet(1,11));
	sendkey(pj.getMobilenum(),getdataxlsheet(1,12));
	javascriptscrolldown(pj.getSubmit());
	clicks(pj.getSubmit());

}


@When("User should click the profile on top left and click logout")
public void user_should_click_the_profile_on_top_left_and_click_logout() {
	
	implicitwaits();
	PojoCreateNewUser pj = new PojoCreateNewUser();
	javascriptclick(pj.getProfile());
	javascriptclick(pj.getLogout());
}

@Then("User account should be log outted")
public void user_account_should_be_log_outted() {
    
	
	System.out.println("Account successfully log out");

}






}




