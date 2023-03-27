package mainUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scrolling {
	 WebDriver driver;
	public void scrollingByPixelMethod()
	{
		JavascriptExecutor scroll= ((JavascriptExecutor)driver);
		scroll.executeScript("window.scrollBy(0,900)");
	}
	
	public void scrollingByscrollIntoViewMethod()
	{
		WebElement argument= driver.findElement(By.xpath(" "));
		
		JavascriptExecutor scroll= ((JavascriptExecutor)driver);
		scroll.executeScript("arguments[0].scrollIntoView(true)", argument);
	}
	
}
