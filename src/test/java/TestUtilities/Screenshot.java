package TestUtilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	static WebDriver driver;
	
	public static void screenShotcaptureMethod () throws IOException
	{
		File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("xpathoffolder\\Imagename.png");
		FileHandler.copy(source, destination);
	}
	
}
