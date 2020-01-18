package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cartsteps {
	WebDriver driver;
	@Given("^Navigate to flipkart site$")
	public void navigate_to_flipkart_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(5000);
	    throw new PendingException();
	}

	@When("^Login with valid userid and password$")
	public void login_with_valid_userid_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9710886973");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9710886973");	
	    throw new PendingException();
	}

	@When("^Goto mobile section$")
	public void goto_mobile_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mobiles");	 
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
	    throw new PendingException();
	}

	@When("^Add a single product in cart$")
	public void add_a_single_product_in_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a")).click();
		
		//Fill the pin code to check the availability
		driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys("600028");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[6]/div/div/div[1]/div[2]/div/div[2]/div[1]/span")).click();
	    throw new PendingException();
	}

	@Then("^click on Add to cart button for single product$")
	public void click_on_Add_to_cart_button_for_single_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("_2AkmmA.2Npkh4.2MWPVK")).click();
	    throw new PendingException();
	}

	@When("^Goto TV section$")
	public void goto_TV_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("mobiles");	 
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
		Thread.sleep(5000);
	    throw new PendingException();
	}

	@When("^Add a multiple product in cart$")
	public void add_a_multiple_product_in_cart() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/a")).click();
		//Fill the pin code to check the availability
		driver.findElement(By.xpath("//*[@id=\"pincodeInputId\"]")).sendKeys("600028");
	    throw new PendingException();
	}

	@Then("^click on Add to cart button for multi prdoucts$")
	public void click_on_Add_to_cart_button_for_multi_prdoucts() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("_2AkmmA.2Npkh4.2MWPVK")).click();

	    throw new PendingException();
	}

	
	
}
