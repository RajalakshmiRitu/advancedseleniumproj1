package com.testyantra.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ATest 

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
		driver.get("https://www.ubuy.co.in/");
		Actions act=new Actions(driver);
		WebElement Account=driver.findElement(By.xpath("//abbr[contains(text(),'Account')]"));
		Thread.sleep(2000);
		act.moveToElement(Account).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.name("login[username]")).sendKeys("krajalakshmi39@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("rithanya143");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
