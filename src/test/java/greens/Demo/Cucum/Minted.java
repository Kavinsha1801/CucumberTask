package greens.Demo.Cucum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Minted {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemakavin\\Desktop\\selenium\\Airline\\driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.minted.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().to("https://www.whitestuff.com/global/");
		Thread .sleep(5000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		
		WebElement stat = driver.findElement(By.xpath("//span[text()='stationery']"));
		Actions a= new Actions(driver);
		a.moveToElement(stat);
		stat.click();
		Thread.sleep(5000);
		WebElement wed = driver.findElement(By.xpath("//a[text()='weddings']"));
		
		a.moveToElement(wed);
		wed.click();
	driver.navigate().refresh();
		
	}

}
