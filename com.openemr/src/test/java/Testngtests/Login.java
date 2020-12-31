package Testngtests;

import org.testng.annotations.Test;

import com.openemr.businessfunctions.Baseutil;
import com.openemr.businessfunctions.CommonBusinessUtils;
import com.openemr.configuration.Prop;
import com.openemr.pagerepository.LoginPage;
import com.openemr.utilityfunctions.ExcelUserPass;

public class Login extends Baseutil{
  @Test
  
  
  public void f() {
	  
	  Baseutil.openApp();
	  CommonBusinessUtils.login(Prop.get("username"),Prop.get("password"));
	 /* LoginPage.enterUserName();Prop.get("username")
	  LoginPage.enterPassword();
	  LoginPage.click();*/
  }
}
