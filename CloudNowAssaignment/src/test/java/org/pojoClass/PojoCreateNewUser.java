package org.pojoClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.utilities.BaseClass;

public class PojoCreateNewUser extends BaseClass{

	
	public PojoCreateNewUser() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement emailid;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement signin;
	
	@FindBy(xpath="//span[text()='Users']")
	private WebElement users;
	
	@FindBy(xpath="(//button[@type='button'])[3]")
	private WebElement add;
	
	@FindBy(xpath="(//div//div//div//div//div//select)[3]")
	private WebElement organisation;
	
	@FindBy(xpath="(//div//div//div//div//div//select)[4]")
	private WebElement role;
	
	@FindBy(xpath="(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]")
	private WebElement firstname;
	
	@FindBy(xpath="(//div//div//input[@type='text'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement emailids;
	
	@FindBy(xpath="(//textarea[@type='text'])[1]")
	private WebElement description;
	
	@FindBy(xpath="(//textarea[@type='text'])[2]")
	private WebElement address;
	
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement city;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement country;
	
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement landline;
	
	@FindBy(xpath="(//input[@type='text'])[8]")
	private WebElement mobilenum;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement submit;
	
	@FindBy(xpath="//img[@id='profileDropdown']")
	private WebElement profile;
	
	@FindBy(xpath="//span[text()='Logout']")
	private WebElement logout;
	
	
	
	public WebElement getEmailid() {
		return emailid;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsers() {
		return users;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getOrganisation() {
		return organisation;
	}

	public WebElement getRole() {
		return role;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmailids() {
		return emailids;
	}

	public WebElement getDescription() {
		return description;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getLandline() {
		return landline;
	}

	public WebElement getMobilenum() {
		return mobilenum;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getProfile() {
		return profile;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
