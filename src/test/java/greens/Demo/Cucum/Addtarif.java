package greens.Demo.Cucum;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Addtarif {
	static WebDriver driver;
	@Given("Launch chrome browser")
	public void launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemakavin\\Desktop\\selenium\\Airline\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demo.guru99.com//telecom");
		}
	
	@Given("click the Add tariff plan link")
	public void click_the_Add_tariff_plan_link() {
	driver.findElement(By.xpath("//a[text()='Add Tariff Plan'][1]")).click();
	}

	@When("Add tariff detail")
	public void add_tariff_detail(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String,String>> twodmap = dataTable.asMaps(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(twodmap.get(0).get("rental1"));
		driver.findElement(By.id("freelocmins")).sendKeys(twodmap.get(0).get("freelocmins"));
		driver.findElement(By.id("freeintmins")).sendKeys(twodmap.get(1).get("freeintmins"));
		driver.findElement(By.name("freesms")).sendKeys(twodmap.get(0).get("freesms"));
		driver.findElement(By.id("localcharge")).sendKeys(twodmap.get(2).get("localcharge"));
		driver.findElement(By.name("intcharge")).sendKeys(twodmap.get(0).get("intcharge"));
		driver.findElement(By.id("smscharge")).sendKeys(twodmap.get(2).get("smscharge"));
		driver.findElement(By.name("submit")).click();
	}

	@Then("Generate the tariff details and display")
	public void generate_the_tariff_details_and_display() {
		Assert.assertTrue("Verify tariff plan",driver.findElement(By.xpath("//header[@class='align-center']")).isDisplayed());
	}


}
