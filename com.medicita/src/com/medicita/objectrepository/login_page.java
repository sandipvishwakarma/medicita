package com.medicita.objectrepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login_page {
	@FindBy(id="Email")
	private WebElement email;
	
	@FindBy(id="Password")
	private WebElement enterpassword;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement btnsubmit;
	
   @ FindBy(xpath="//a[text()='Password']")
	private WebElement fgotpassword;
   
  // @FindBy()

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return enterpassword;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	
	public void login(String Email, String Password){
		email.sendKeys(Email);
		enterpassword.sendKeys(Password);
		
		btnsubmit.click();
	
	
	

}
	}

	
