package Academy;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;



public class BrowserTest {

	WebDriver driver;
	@Test
	public void getData()
	{
		System.out.println("Hello Guy");
		String browser = System.getProperty("browser", "safari");
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("safari")) {
			driver=new SafariDriver();
		}
			driver.get("https://www.google.com");
		driver.close();
	
	}
}
