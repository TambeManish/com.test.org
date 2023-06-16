package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Two extends Base {

	public WebDriver driver;
	@Test
	public void testOnFireFox() throws InterruptedException {
		driver.get("https://google.com");
		
		 System.out.println(driver.getTitle()+ "Title from FireFox browser");
		 
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("docker");
        
     
		 
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		 driver=initializeBrowser("firefox");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
