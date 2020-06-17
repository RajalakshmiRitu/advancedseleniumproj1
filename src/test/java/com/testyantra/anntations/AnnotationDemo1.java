package com.testyantra.anntations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo1 
{
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
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	

}
