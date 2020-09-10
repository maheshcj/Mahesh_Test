package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript {

	public static void main(String[] args) {
		//System.out.println("Jai Sadguru");
		System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.close();		
	}

}
