package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ActiTimeHomePage
{
	 static
	    {
	    	System.setProperty("webdriver.chrome.driver", "./softwares1/chromedriver.exe");   
	    }
		@Test
		public void tc_01() throws InterruptedException
		{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			SoftAssert s=new SoftAssert();
			driver.get("https://demo.actitime.com/login.do");
			String expected="actiTIME - Login";
			String actual=driver.getTitle();
			//System.out.println(actual);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
			driver.findElement(By.id("username")).sendKeys("admin");
			s.assertAll();
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
			Thread.sleep(2000);
			
			String dashPageTitleExpected="actiTIME - Enter Time-Track";
			String dashPageTitleActual=driver.getTitle();
			Assert.assertEquals(dashPageTitleActual, dashPageTitleExpected);
			Thread.sleep(4000);
			driver.close();
	}

}
