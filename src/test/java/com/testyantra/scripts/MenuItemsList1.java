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

public class MenuItemsList1
{
	 static {
			
			System.setProperty("webdriver.chrome.driver", "./softwares1/chromedriver.exe");
			
		}
		
	@Test
	public void tc_verifyMenuItems() throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		Reporter.log("Launching the browser");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://www.urbanladder.com/");
	    Reporter.log("Open the application");
	    driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		   
		WebElement w=driver.findElement(By.xpath("//span[@class='topnav_itemname'][contains(text(),'Living')]"));
		Actions act=new Actions(driver);
		act.moveToElement(w).perform();
		
		String sofaname=driver.findElement(By.xpath("//a[@class='inverted'][contains(text(),'Sofa Set')]")).getText();
		System.out.println(sofaname);
		
		//List<WebElement> menuItems=driver.findElements(By.xpath("//li//div//a[@class='inverted'][contains(text(),'Deals of the Week')]"));
		List<WebElement> menuItems=driver.findElements(By.xpath("//li[@class='topnav_item livingunit']//div//div//ul[@class='inline-list left']//li[@class='sublist_item']//div//a"));
		
		List<String> menuItemsExpected=Arrays.asList("Sofa Set","Sofa cum Bed","Chairs","Tables","Storage","Balcony & Outdoor");
		//List<WebElement>subText=driver.findElements(By.xpath("//ul[@class='taxonslist']")).subList(0, 10);
		
		List<String> menuItemsActual = new ArrayList<String>();
		
		for(WebElement menuItem:menuItems) 
		{
			
		     menuItemsActual.add(menuItem.getText());
		
		}
	
		
		Assert.assertEquals(menuItemsActual, menuItemsExpected);
		Reporter.log("Verifying the menu Items");
		Thread.sleep(3000);
		Reporter.log("Closing the browser");
		
		
		
		System.out.println("ok");	
		
	}
	}


