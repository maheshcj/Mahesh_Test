package scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver","E:\\Softwares\\geckodriver-v0.19.1-win64\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.facebook.com");
driver.findElement(By.id("email")).sendKeys("mahesh.jogur@gmail.com");
driver.findElement(By.name("pass")).sendKeys("jaisadguru@625");
//driver.findElement(By.xpath(xpathExpression))
//driver.findElement(By.xpath(//input[@value='Log In').
	}

}
