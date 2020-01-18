package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;
	// testing push to github and pull from git
	@Given("^Navigate to flipkart site$")
	public void navigate_to_flipkart_site() throws Throwable 
	{
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.flipkart.com/");
		  Thread.sleep(5000);
	}

	@When("^enter a invalid ([^\"]*) and ([^\"]*)$")
	public void enter_a_invalid_and(String username, String password) throws Throwable {
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);

	    
	}

	@Then("^show a error message([^\"]*)$")
	public void show_a_error_message(String status) throws Throwable {
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
System.out.println(status);
	    
	}

}
