package com.testyantra.scripts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MenuItemsList 
{
	static
    {
    	System.setProperty("webdriver.chrome.driver", "./softwares1/chromedriver.exe");   
    }
	@Test
	public void tc_verifyMenuItems() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
	    Reporter.log("Loading AUT");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Reporter.log("Closing the welcome pop-up");
	   
		WebElement w=driver.findElement(By.xpath("//span[@class='topnav_itemname'][contains(text(),'Living')]"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		
		List<WebElement> menuItems=driver.findElements(By.xpath("//li[@class='topnav_item livingunit']//div//div//ul[@class='inline-list left']//li[@class='sublist_item']//div//a"));
		
		
		List<String> menuItemsExpected=Arrays.asList("Sofa Set","Sofa cum Bed","Chairs","Tables","Storage","Balcony & Outdoor");
		List<String> menuItemsActual = new ArrayList<String>();
		
		for(WebElement menuItem:menuItems) {
			
		     menuItemsActual.add(menuItem.getText());
		
		}
	
		
		Assert.assertEquals(menuItemsActual, menuItemsExpected);
		Reporter.log("Verifying the menu Items");
		Thread.sleep(3000);
		
		driver.close();
		Reporter.log("Closing the browser");
		
		
		
		System.out.println("ok");	
		
	}
}


