package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraLogin extends BasePage{

		// WebElements for Login
		@FindBy(xpath=".//*[@type='tel']")
		private WebElement txtMobile;

		
		@FindBy(xpath=".//*[text()='CONTINUE']")
		private WebElement btnContinue;
		
		
		private WebDriver driver = null;
		
		// Constructor to Initialize the Page Factory
		
		public MyntraLogin(WebDriver driver) throws Exception {
			super(driver);
			this.driver =  driver;
			if(!isLoginPageDisplayed()) throw new Exception("Login Page not displayed");
		}
			
		
		// Actions to be performed in Login Page
		public boolean isLoginPageDisplayed() {
			return txtMobile.isDisplayed();
		}
		
		public void performLogin(String mobile) {
			txtMobile.sendKeys(mobile);
			btnContinue.click();
		}
		
			
	}


