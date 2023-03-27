package mainUtilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementWait {

	static WebDriver driver;
	
	// implicitwait method
	public static void ImplicitWait(int timeout)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeout));
	}
	
	// explicitwait method
	public static void ExplicitWait(int timeout,String elementxpath)
	{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementxpath)));
	
	}
	
	//fluentwait method
	public static void fluentWait(int timeout,int polling)
	{
		Wait <WebDriver> wait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(timeout))
				.pollingEvery(Duration.ofSeconds(polling))
				.ignoring(NoSuchElementException.class);
	}
}
