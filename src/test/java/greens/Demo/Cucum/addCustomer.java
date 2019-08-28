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


public class addCustomer {
	static WebDriver driver;
	@Given("Launch the chrome browser")
public void launch_the_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemakavin\\Desktop\\selenium\\Airline\\driver\\chromedriver.exe");
    driver = new ChromeDriver(); 
   driver.get("http://demo.guru99.com/telecom/");
   }

@Given("click the Addd customer link")
public void click_the_Addd_customer_link() {
	driver.findElement(By.xpath("//a[text()='Add Customer'][1]")).click();
    
}
//SCENARIO CODE//
/*@When("Add customer details")
public void add_customer_details() {
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys("Kavin");
	driver.findElement(By.id("lname")).sendKeys("Raj");
	driver.findElement(By.id("email")).sendKeys("sm.kavinraj@gmail.com");
	driver.findElement(By.name("addr")).sendKeys("Pondicherry");
	driver.findElement(By.id("telephoneno")).sendKeys("8122123321");
	driver.findElement(By.name("submit")).click();
	
}*/


//SCENARIO OUTLINE CODE//

/*@When("user provide valid details {string},{string},{string},{string},{string}")
public void user_provide_valid_details(String fname, String lname, String email, String address, String phoneno) 
    
{
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(fname);
	driver.findElement(By.id("lname")).sendKeys(lname);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.findElement(By.name("addr")).sendKeys(address);
	driver.findElement(By.id("telephoneno")).sendKeys(phoneno);
	driver.findElement(By.name("submit")).click();
	}*/



//ONE DIMENSIONAL USING LIST METHOD
/*@When("Add customer details")
public void add_customer_details(io.cucumber.datatable.DataTable dataTable) {
	driver.manage().window().maximize();
	List<String> oned=dataTable.asList();
	//List<String> oned=dataTable.asList(String.class);
	driver.findElement(By.xpath("//label[text()='Done']")).click();
	driver.findElement(By.id("fname")).sendKeys(oned.get(0));
	driver.findElement(By.id("lname")).sendKeys(oned.get(1));
	driver.findElement(By.id("email")).sendKeys(oned.get(2));
	driver.findElement(By.name("addr")).sendKeys(oned.get(3));
	driver.findElement(By.id("telephoneno")).sendKeys(oned.get(4));
	driver.findElement(By.name("submit")).click();
}*/

//ONE DIMENSIONAL USING MAP 
@When("Add customer details")
public void add_customer_details(io.cucumber.datatable.DataTable dataTable) {
driver.manage().window().maximize();
Map<String, String> oned = dataTable.asMap(String.class, String.class);
driver.findElement(By.xpath("//label[text()='Done']")).click();
driver.findElement(By.id("fname")).sendKeys(oned.get("fname"));
driver.findElement(By.id("lname")).sendKeys(oned.get("lname"));
driver.findElement(By.id("email")).sendKeys(oned.get("email"));
driver.findElement(By.name("addr")).sendKeys(oned.get("address"));
driver.findElement(By.id("telephoneno")).sendKeys(oned.get("phoneno"));
driver.findElement(By.name("submit")).click();
}

@Then("generate the customer id and display")
public void generate_the_customer_id_and_display() {
 //Assert.assertTrue("verified Customer Id",driver.findElement(By.xpath("//td@align='center'[2]")).isDisplayed());
	Assert.assertTrue("Verify customer id",driver.findElement(By.xpath("//td[@align='center'][2]")).isDisplayed());
	//Assert.assertTrue("Verify customer id",driver.findElement(By.xpath("//td[@align='center'][2])).isDisplayed());
}
}
