package com.testyantra.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnDemo1 extends AnnDemo3
{
	@BeforeClass
	public void beforeClassOne()
	{
		System.out.println("Before Class demo1");
	}
	@AfterClass
	public void afterClassOne()
	{
		System.out.println("After Class demo1");
	}
	
	@Test
	public void tc_01()
	{
		System.out.println("Executed tc_01");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	

}
