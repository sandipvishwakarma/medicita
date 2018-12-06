package com.medicita.genriclib;


import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.medicita.objectrepository.Flib;
import com.medicita.objectrepository.login_page;


public class baseClass {
	public static WebDriver driver;
	@BeforeClass
	public  void configBC()
	{
		 driver = new FirefoxDriver();
        Reporter.log("Launch browser");
	}
	@BeforeMethod
	public void configBM() throws Throwable
	{
		System.out.println("Login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Flib fobj=new Flib();
		Properties pobj=new Properties();
		String url=fobj.loginobj().getProperty("url");
		driver.get(url);
		login_page lp = PageFactory.initElements(baseClass.driver, login_page.class);
		String emailEnter=fobj.loginobj().getProperty("email");
		String pwdenter=fobj.loginobj().getProperty("password");
		
		lp.getEmail().sendKeys(emailEnter);
		lp.getPassword().sendKeys(pwdenter);
		lp.getBtnsubmit().click();
		/*driver.get("http://www.medicita.com");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("Email")).sendKeys("anshul.jain@brsoftech.org");
		driver.findElement(By.id("Password")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[text() ='Submit']")).click();
		driver.findElement(By.xpath("//a[text()='Dashboard']")).click();
      */
	}
	@AfterMethod
	public void configAM()
	{
		//driver.findElement(By.id("NameId")).click();
		//driver.findElement(By.linkText("Sign Out")).click();
		
		//logout
	}
	@AfterClass
	public void configAC()
	{
		//driver.close();
	}

}
