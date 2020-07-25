//package stepDefinitions;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class StepDefinitionTable {
//
//	WebDriver driver;
//	@Given("^User is already on the login page$")
//	public void User_is_already_on_the_login_page(){
//	
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.silentOutput", "true");
//		driver=new ChromeDriver();
//		
//		driver.get("http://demo.guru99.com/v4/");
//	}
//	
//	@When("^Title of login page is Guru99 Bank Home Page$")
//	public void Title_of_login_page_is_Guru99_Bank_Home_Page() {
//		String title=driver.getTitle();
//		
//		System.out.println(title);
//		String expTitle="Guru99 Bank Home Page";
//		Assert.assertEquals(title, expTitle);
//	}
//	
//	@Then("^User enters username and password$")
//	public void User_enters_username_and_password(DataTable credentials) {
//		
//		List <List<String>> data=credentials.raw();
//		
//		driver.findElement(By.name("uid")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
////		driver.findElement(By.name("uid")).sendKeys(data.get(1).get(0));
////		driver.findElement(By.name("password")).sendKeys(data.get(1).get(1));
//	}
//	
//	@Then("^User clicks login button$")
//	public void User_clicks_login_button() {
//		
//		driver.findElement(By.name("btnLogin")).click();
//	}
//	@Then("^User is on home page$")
//	public void User_is_on_home_page() {
//		String homeTitle=driver.getTitle();
//		
//		Assert.assertEquals("Guru99 Bank Manager HomePage", homeTitle);
//		//System.out.println("Home page title is :"+ homeTitle);
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() {
//		driver.close();
//	}
//}
