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

public class ValidateTitle extends base{
	//public static org.apache.log4j.Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void Intializer() throws IOException
	{
		driver = initializeDriver();
		//log.info("driver is intialized");
		driver.get("http://qaclickacademy.com");
		//log.info("succesfully opened the browser");
	}
	
	@Test
	public void TitleValidation() throws IOException
	{
		
		
		LandingPage l = new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		//log.info("Sucessfully validated featured courses");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

