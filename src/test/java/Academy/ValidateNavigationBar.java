package Academy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import org.testng.AssertJUnit;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigationBar extends base{
	//public static org.apache.log4j.Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void Intializer() throws IOException
	{
		driver = initializeDriver();
		driver.get("http://qaclickacademy.com");
		//log.info("sucessfully opened");
	}
	@Test
	public void NavigationBarValidation() throws IOException
	{
	
		LandingPage l = new LandingPage(driver);
		Assert.assertTrue(l.getNavigationBar().isDisplayed());
		//log.info("Navigation bar is displayed");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
