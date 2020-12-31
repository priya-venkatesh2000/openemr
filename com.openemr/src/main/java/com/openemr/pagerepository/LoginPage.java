package com.openemr.pagerepository;

import org.openqa.selenium.By;

import com.openemr.businessfunctions.Baseutil;
import com.openemr.configuration.Prop;

public class LoginPage extends Baseutil {

	public static By txtusername = By.id("authUser");
	public static By txtpass=By.id("clearPass");
	public static By buttonlogin=By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button");


	public static void enterUserName(String usr) {
		driver.findElement(txtusername).sendKeys(usr);

	}

	public static void enterPassword(String pass) {
		driver.findElement(txtpass).sendKeys(pass);
	}

	public static void click() {
		driver.findElement(buttonlogin).click();
	}
}