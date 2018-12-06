package com.medicita.objectrepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.medicita.genriclib.baseClass;

public class Mymessage extends baseClass {
	@FindBy (xpath = "//a[text()='My Messages']")
	private WebElement my_message;
	@FindBy(xpath = "//a[text()='Compose Message']")
	private WebElement compose_mail;
	
	@FindBy(xpath ="//select[@id='ReceiverId']")
	private WebElement Doctor_name_DD;
	@FindBy(id ="PatientSubject")
	private WebElement Patient_Subject;
	
	@FindBy(xpath ="//textarea[@id='PatientMessage']")
	private WebElement Patient_Message;
	@FindBy (xpath = "//input[@value ='Send Message']")
	private WebElement Send_message;
	
	public WebElement getMy_message() {
		return my_message;
	}
	public WebElement getCompose_mail() {
		return compose_mail;
	}
	public WebElement getDoctor_name_DD() {
		return Doctor_name_DD;
	}
	public WebElement getPatient_Subject() {
		return Patient_Subject;
	}
	public WebElement getPatient_Message() {
		return Patient_Message;
	}
	public WebElement getSend_message() {
		return Send_message;
	}

	public void doctordropdown ()
	{
		boolean flag =false;
		String exp = "mick mark (mick@mailinator.com)";
		WebElement wb = Doctor_name_DD;
		Select slDD = new Select(wb);
		List<WebElement> lst = slDD.getOptions();
		for (WebElement wbe : lst)
		{
			String optionvalue = wbe.getText();
			if (optionvalue.equals(exp))
			{
				slDD.selectByVisibleText(exp);
				flag =true;
				if (flag)
				{
					wbe.click();
				}
				break;
				
			}
			
			
		}
		
		
		
	}
}
