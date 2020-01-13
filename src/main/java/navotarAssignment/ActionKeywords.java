package navotarAssignment;
 
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NavotarAssignment.Utils;
 
public class ActionKeywords {
	 
	 public static void open_Newtab(WebDriver driver){
		 String a = "window.open('about:blank','_blank');";
		 JavascriptExecutor js = (JavascriptExecutor) driver;  
		 js.executeScript(a);			 
	 }
	 
	 public static void navigate(WebDriver driver){ 
		 String currentHandle = driver.getWindowHandle();
		 
	        Set < String > handles = driver.getWindowHandles();

	        for (String actual: handles) {

	            if (!actual.equalsIgnoreCase(currentHandle)) { //switching to the opened tab              

	                driver.switchTo().window(actual); //opening the URL saved.              

	                driver.get(Utils.BASE_URL);

	            }

	        }
	     Dimension d = new Dimension(968,1024);
	     driver.manage().window().setSize(d);
	 }
	 
	 
	 public static void select_Vehicle(WebDriver driver){			 
        Select vehicle_type = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[1]/div[2]/select")));			
		vehicle_type.selectByVisibleText(Utils.Vechicle);	
	 }
	 
	 public static void input_Pickupdate(WebDriver driver){
			driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input")).clear();
			driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[1]/p/input")).sendKeys(Utils.Pickup_date); 
	 }
	 
	 public static void input_Returndate(WebDriver driver){
			driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[1]/p/input")).clear();
			driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[1]/p/input")).sendKeys(Utils.return_date);
	}
	 
	 public static void select_Pickuptime(WebDriver driver, String pckuptime){
			Select pick_up_time = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[2]/div[2]/select")));			
			pick_up_time.selectByVisibleText(pckuptime);	
	}

	 public static void select_Returntime(WebDriver driver, String rtntime){
			Select drop_time = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[3]/div[2]/select")));			
			drop_time.selectByVisibleText(rtntime);	
	}	 

	 public static void select_Source(WebDriver driver){
			Select source_location = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[1]/select")));			
			source_location.selectByVisibleText(Utils.pickup_location);
	}
	 	 
	 public static void select_Destination(WebDriver driver){
			Select destination_location = new Select(driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[4]/div[2]/select")));			
			destination_location.selectByVisibleText(Utils.drop_location);	
	}
	 
	 public static void click_Vehicle(WebDriver driver){
		    WebDriverWait wait = new WebDriverWait(driver, Utils.WAIT_TIME);
	        WebElement radio = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[2]/div[2]/div[6]/div[3]/div/div[1]/label")));
			Actions actions = new Actions(driver);
			actions.moveToElement(radio).click().build().perform();			
	}	
	 
	 public static void check_Dropoff(WebDriver driver){
		 driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[5]/div/input")).click();	
	}
	 
	 public static void click_Next(WebDriver driver){
		 driver.findElement(By.xpath("//*[@id=\"mainview\"]/div[2]/div[6]/div[4]/div[2]/ul/li/button")).click();	
	}
	 
	 public static void click_Search(WebDriver driver){
		 driver.findElement(By.xpath("/html/body/form/div/div/div/div/div/div[7]/div[2]/button")).click();	
	}
 
 }