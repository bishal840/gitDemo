package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Tut2 {

	@Test
	public void Demo3()
	{
		System.out.println("HIIII");
	}

	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("AF Suite");

	}
}
