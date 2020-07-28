package core;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
private WebDriver driver = null;
	
	public WebDriver getDriver(String browser)
	{
		switch(browser.toLowerCase())
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver", "E:\\BrowserFiles\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", "E:\\BrowserFiles\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		case "ie":
		{
			System.setProperty("webdriver.ie.driver", "E:\\BrowserFiles\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			break;
		}
		default:
			System.out.println("Incorrect details entered");
		}
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
        
	}
	
	public void quitdriver()
	{
		if(null != driver)
		{
			driver.quit();
		}
	}

}
