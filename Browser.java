package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "c:\\selenium\\gecko  web driver\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get(null);	

		

	}

}
