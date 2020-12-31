package com.openemr.businessfunctions;

import com.openemr.pagerepository.LoginPage;

public class CommonBusinessUtils extends Baseutil{
	
	
	public static void login(String usr,String pass) {
	 LoginPage.enterUserName(usr);
	  LoginPage.enterPassword(pass);
	  LoginPage.click();
	
	}

}
