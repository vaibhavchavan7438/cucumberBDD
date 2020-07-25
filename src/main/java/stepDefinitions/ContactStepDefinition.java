package stepDefinitions;


import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactStepDefinition {

	WebDriver driver;

	@Given("^User is already on the login page$")
	public void User_is_already_on_the_login_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/v4/");
	}

	@When("^Title of login page is Guru99 Bank Home Page$")
	public void Title_of_login_page_is_Guru99_Bank_Home_Page() {
		String title = driver.getTitle();

		System.out.println(title);
		String expTitle = "Guru99 Bank Home Page";
		Assert.assertEquals(title, expTitle);
	}

	@Then("^User enters login credentials$")
	public void User_enters_login_credentials(DataTable loginCreadentials) {
		
		for ( Map<String, String> data:loginCreadentials.asMaps(String.class,String.class) ) {
	
			driver.findElement(By.name("uid")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
	}

	@Then("^User clicks login button$")
	public void User_clicks_login_button() {

		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^User is on home page$")
	public void User_is_on_home_page() {
		String homeTitle = driver.getTitle();

		Assert.assertEquals("Guru99 Bank Manager HomePage", homeTitle);
		// System.out.println("Home page title is :"+ homeTitle);
	}

	
	@Then("^User clicks on New Customer tab$")
	public void User_clicks_on_New_Customer_tab() {
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
	}
	
	
	@Then("^User enter required information and creates contact$")
	public void User_enter_required_information_and_creates_contact(DataTable contactInfo) {
		for ( Map<String, String> data:contactInfo.asMaps(String.class,String.class) ) {
			
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(data.get("Name"));
			driver.findElement(By.xpath("//input[@id='dob']")).sendKeys(data.get("DOB"));
			driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(data.get("Address"));
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(data.get("City"));
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(data.get("State"));
			driver.findElement(By.xpath("//input[@name='pinno']")).sendKeys(data.get("Pin"));
			driver.findElement(By.xpath("//input[@name='telephoneno']")).sendKeys(data.get("Mobile"));
			driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(data.get("Email"));
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("Password"));
			//submit
			driver.findElement(By.xpath("//input[@name='sub']")).click();
			//click on new customer
			driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
			
	}	
		
	}
	@Then("^close the browser$")
	public void close_the_browser() {
		driver.close();
	}

}
