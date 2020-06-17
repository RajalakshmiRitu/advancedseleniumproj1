package com.testyantra.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnoDemo2 extends AnnDemo3
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class in demo2");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class in demo2");
	}
	

	@Test
	public void tc_02()
	{
		System.out.println("Executed tc_01");
	}
}
