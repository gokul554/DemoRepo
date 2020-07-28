package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraHome extends BasePage{
		
		// WebElements for Home
		
		@FindBy(xpath=".//*[text()='Profile']/..")
		private WebElement profile;
		
		@FindBy(xpath=".//a[text()='login / Signup']")
		private WebElement btnLogin;
		
		private WebDriver driver = null;
		
		// Constructor to Initialize the Page Factory	
		public MyntraHome(WebDriver driver) throws Exception {
			super(driver);
			this.driver =  driver;
			if(!isHomePageDisplayed()) throw new Exception("Home Page not displayed");
		}
		
		// Actions to be performed in Home Page
		
		public boolean isHomePageDisplayed() {
			return profile.isDisplayed();
		}
		
		public void navigateToLoginPage() {
			moveToElement(driver, profile);
			btnLogin.click();
		}
		
		
		

	}


