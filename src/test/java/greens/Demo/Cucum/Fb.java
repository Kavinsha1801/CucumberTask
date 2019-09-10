package greens.Demo.Cucum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemakavin\\Desktop\\selenium\\Airline\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
	WebElement name = driver.findElement(By.id("email"));
	name.sendKeys("kavin");
	String s = name.getAttribute("value");
	Thread.sleep(2000);
	System.out.println(s);
	}

}
