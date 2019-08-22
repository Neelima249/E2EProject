package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn = By.xpath("//*[@id='homepage']/header/div[1]/div/nav/ul/li[4]/a");
	By Title = By.xpath("//*[@id='content']/div/div/h2");
	By NavBar = By.xpath("//*[@id='homepage']/header/div[2]/div/nav/ul");
	//constructor with arguments
	public LandingPage(WebDriver driver2) {
		this.driver=driver2;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(Title);
	}
	public WebElement getNavigationBar()
	{
		return driver.findElement(NavBar);
	}
	

}
