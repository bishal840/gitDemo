package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(dataProvider= "getData")
	public void WebCarLogin(String un, String pw)
	{
		System.out.println("WebCar");
		System.out.println(un);
		System.out.println(pw);
	}
	
	@Test(groups= {"Smoke"},dependsOnMethods= {"MobileCarSecond"})
	public void MobileCarLogin()
	{
		System.out.println("MobileCar");
	}
	
	@Test
	public void MobileCarSecond()
	{
		System.out.println("MobileCarSecond");
	}
	
	@Test
	public void GuestUserCar()
	{
		System.out.println("GuestCar");
	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("BF Suite");

	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0]="un1";
		obj[0][1]="pw1";
		obj[1][0]="un2";
		obj[1][1]="pw2";
		obj[2][0]="un3";
		obj[2][1]="pw3";
		
		return obj;
	}
	
	@DataProvider
	public Object[][] getData2()
	{
		Object[][] obj = new Object[3][1];
		obj[0][0]="un11";
		obj[1][0]="un12";
		obj[2][0]="un13";
		
		return obj;
	}
	
}
