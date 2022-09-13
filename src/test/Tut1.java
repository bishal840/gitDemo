package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tut1 {

	@AfterTest
	public void exitStep()
	{
		System.out.println("Run Last in test");
	}
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("BF Class in Tut1");

	}
	
	
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("BF method in Tut1");

	}
	
	@Test
	public void Demo1()
	{
		System.out.println("Hello Tut1");
		Assert.assertTrue(false);
	}
	
	@Test
	public void Demo2()
	{
		System.out.println("Bye tut1");
	}
}
