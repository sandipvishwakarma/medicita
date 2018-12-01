package com.medicita.logintest;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medicita.genriclib.baseClass;
import com.medicita.objectrepository.Flib;
import com.medicita.objectrepository.login_page;

public class logintest extends baseClass{
	@Test
	public void verifylogintest() throws Throwable
	{
		Flib fobj=new Flib();
		//Properties pobj=new Properties();
		login_page lp = PageFactory.initElements(baseClass.driver, login_page.class);
		String emailEnter=fobj.loginobj().getProperty("email");
		String pwdenter=fobj.loginobj().getProperty("password");
		
		lp.getEmail().sendKeys(emailEnter);
		lp.getPassword().sendKeys(pwdenter);
		lp.getBtnsubmit().click();
	}

}
