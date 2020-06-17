package com.testyantra.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AnnDemo3 
{
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
