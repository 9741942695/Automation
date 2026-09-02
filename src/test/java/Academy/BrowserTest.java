package Academy;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {

	
	@Test
	public void getData()
	{
		System.out.println("Hellos Guys");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();
	
		
		
	}
}
