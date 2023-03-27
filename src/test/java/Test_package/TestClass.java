package Test_package;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Package.Home_page;
import POM_Package.Loginpage;
import TestUtilities.ReadFiles;
import TestUtilities.StaticBrowserClass;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestClass {
	
	static WebDriver driver;
	
	
	@Parameters({"browser"})
	
	
	
	@BeforeTest
	
	public void beforetest(String browser)
	{
		driver= StaticBrowserClass.launchBrowsers(browser, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", 10);
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("its before class of suitclass1");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("its before method of suitclass1");
	}
	
	@Test 
	public void test1() throws EncryptedDocumentException, IOException
	{
		
		//SoftAssert s=new SoftAssert();
		Loginpage login=new Loginpage(driver);
		
	    login.sendusername(ReadFiles.fetchDataFromExcel(1, 0));
		login.sendpassword(ReadFiles.fetchDataFromExcel(3, 1));
		login.clickloginbutton();
		
		
		/*String ExpectedResult= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		//String ActualResult=driver.getCurrentUrl();
		//Assert.assertEquals(ActualResult, ExpectedResult);
		
		Home_page home=new Home_page(driver);
		
		boolean result=home.AdminDisplayed();
		s.assertTrue(result, "Admin option is present");
		//s.assertFalse(result, "Admin option is not present");
		
		boolean result1=home.PIMDisplayed();
		s.assertTrue(result1, "PIM option is present");
		
		boolean result2=home.LeaveDisplayed();
		s.assertTrue(result2, "Leave option is present");
		
		s.assertAll();	*/
		
		System.err.println("browser is opened");
	}
	
	
	
	@Test
	public void test2()
	{	
		System.out.println("its test2 method");
	}
	@Test
	public void test3()
	{
		System.out.println("its test3 method of suitclass1");	
	}
	
	@Test
	public void test4()
	{
		System.out.println("its test4 method of suitclass1");
	}
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("its after method of suitclass1");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("its after  class of suitclass1");
	}
	
	@AfterTest
	public void aftertest()
	{
		//driver.quit();
	}
	
	
}
