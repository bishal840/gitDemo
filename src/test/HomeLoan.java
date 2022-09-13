package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	@Test(groups= {"San"})
	public void WebHomeLogin()
	{
		System.out.println("WebHomeLogin");
	}
	
	@Test(groups= {"Smoke","San"})
	public void MobileHomeLogin()
	{
		System.out.println("MobileHomeLogin");
	}
	
	@Parameters({"URL"})
	@Test
	public void MobileHomeSecond(String urlparam)
	{
		System.out.println("MobileHomeSecond");
		System.out.println(urlparam);

	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("Run first in test");
	}
	@Test(groups= {"Smoke"})
	public void GuestUserHome()
	{
		System.out.println("GuestUserHome");
	}
	
}
