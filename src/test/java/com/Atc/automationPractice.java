package com.Atc;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.NavotarAssignment.Utils;

public class automationPractice {
	public static void main(String[] args) throws Exception {
		WebDriver wd;
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		
		//ChromeOptions options = new ChromeOptions();
		//options.addExtensions(new File("src\\test\\resources\\vidyad.crx"));	
		wd= new ChromeDriver();
		wd.get("http://automationpractice.com/index.php"); 
		//GetLinks(wd);
		wd.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) wd;
		
		WebDriverWait waittime=new WebDriverWait(wd, 40);
		
		WebElement Plink, productlink;
		
		Plink = wd.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a"));
		
        Actions builder = new Actions(wd);
        Action mouseOverPlink = builder
                .moveToElement(Plink)
                .build();
        
        mouseOverPlink.perform();
        
        WebElement clicklink = wd.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[2]/ul/li[3]/a"));
		
        clicklink.click();        
        
        WebElement Element = waittime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li[1]/div/div[1]/div/a[1]/img")));
		js.executeScript("arguments[0].scrollIntoView(true);",Element );  

		productlink = wd.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));		
        
		Action mouseOverProdlink = builder
                .moveToElement(productlink)
                .moveToElement(wd.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[2]/span")))
                .click()
                .build();
        
        mouseOverProdlink.perform();
      
        WebElement cartpage;
		
		cartpage= waittime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"category\"]/div[2]/div/div/div")));
		
		wd.switchTo().frame(0);
			
		wd.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).clear();
		wd.findElement(By.xpath("//*[@id=\"quantity_wanted\"]")).sendKeys("5");
		
		WebElement clickcart = wd.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
		
		clickcart.click();
		
	
	}
}
