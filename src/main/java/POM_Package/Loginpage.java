package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

//webelements
	@FindBy(xpath="//input[@placeholder='Username']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;
	
	@FindBy(xpath="//p[text()='Forgot your password? ']")
	private WebElement Forgotyourpassword;
	
//constructor
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

//methods
	public void sendusername(String Uname)
	{
		Username.sendKeys(Uname);
	}
	public void sendpassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void clickloginbutton()
	{
		LoginButton.click();
	}
	public void forgotyourpassword()
	{
		Forgotyourpassword.click();
	}
	
	
	
	
}