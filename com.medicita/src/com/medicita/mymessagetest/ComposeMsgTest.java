package com.medicita.mymessagetest;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medicita.genriclib.baseClass;
import com.medicita.objectrepository.Mymessage;

public class ComposeMsgTest extends baseClass{
	@Test
	public void selectdoctortest()
	{
		
	
	Mymessage mymsg = PageFactory.initElements(driver, Mymessage.class);
	
	mymsg.getMy_message().click();
	mymsg.getCompose_mail().click();
	mymsg.doctordropdown();
	}
}
