package tests;

import org.testng.annotations.Test;

import pages.MyntraHome;
import pages.MyntraLogin;

public class MyntraTest extends TestBase{
		
		MyntraHome home =null;
		MyntraLogin login = null;
		
		
		@Test
		public void verifyMyntraLoginLogout() throws Exception {
			home = new MyntraHome(getDriver());
			
			home.navigateToLoginPage();
			
			login = new MyntraLogin(getDriver());
			
			login.performLogin("8008881239");
			home = new MyntraHome(getDriver());
			
		}
		
		
	}


