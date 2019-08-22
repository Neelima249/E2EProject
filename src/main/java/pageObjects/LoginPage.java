package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By email = By.id("user_email");
	By pwd = By.id("user_password");
	By LogIn = By.xpath("//*[@id='new_user']/div[3]/input");
	//constructor with arguments
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement getemail()
	{
		return driver.findElement(email);
	}
public WebElement getPassword()
{
	return driver.findElement(pwd);
	
}
	public WebElement getLogIn()
	{
		 return driver.findElement(LogIn);
	}

}
