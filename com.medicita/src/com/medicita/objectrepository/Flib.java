package com.medicita.objectrepository;

import java.io.FileInputStream;
import java.util.Properties;

public class Flib {
	public Properties loginobj() throws Throwable {
		FileInputStream fip=new FileInputStream("./testdata/commondata.properties");
		Properties  pobj=new Properties();
		pobj.load(fip);
		return pobj;}
	
}
