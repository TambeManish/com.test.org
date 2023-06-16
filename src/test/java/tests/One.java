package tests;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class One extends Base {
public WebDriver driver;
	@Test
	public void testOnChrome() throws InterruptedException {
		driver.get("https://google.com");
		
		 System.out.println(driver.getTitle()+ "Title from Chrome browser");
		 
		 driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("docker");
		 
		//Thread.sleep(2000);
		 
		//driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
	}
	
	@BeforeMethod
	public void setup() throws MalformedURLException {
		 driver=initializeBrowser("chrome");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
