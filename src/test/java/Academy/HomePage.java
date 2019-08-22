package Academy;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.log.Logger;
import org.apache.log4j.Category;
import org.apache.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	//public static org.apache.log4j.Logger log = LogManager.getLogger(base.class.getName());
	
	//public static org.apache.log4j.Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void Intializer() throws IOException
	{
	driver = initializeDriver();
	//log.info("driver is initialized");
		
	}
	@Test(dataProvider="getData")
	
	public void HomePageValidation(String Username, String password) throws IOException, InterruptedException
	{
		
		driver.get("http://qaclickacademy.com");
		//to invoke the methods we need to create an object
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getPassword().sendKeys(password);
		lp.getLogIn().click();
		//log.info("Succesfully entered the email and password");
		}

	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "abc";
		data[0][1] = "1234";
		data[1][0] = "xyz";
		data[1][1] = "5678";
		
		return data;
	}
	
	

}
