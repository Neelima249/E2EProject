package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	//defining driver globally
	public static WebDriver driver;
	public Properties prop;
	
	//developing a method in the base class
	
	public WebDriver initializeDriver() throws IOException
	{
	//creating a properties class in this method
		 prop = new Properties();
		//getting this data.properties file in fileinputstream class
		FileInputStream fis = new FileInputStream("//Users//ummaneni//E2EProject//src//main//java//resources//data.properties");
		//letting the prop object know where the data.properties file is located
		prop.load(fis);
		//by using getproperty method 
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/ummaneni/Documents/Selenium/Browsers/chromedriver-2");
		    driver = new ChromeDriver();
		
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "/Users/ummaneni/Documents/Selenium/Browsers/geckodriver");
		    driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//returning the driver and the driver is a webdriver so change void to WebDriver
		return driver;
	}
	
	public void getScreenShots(String result) throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/ummaneni/Documents/Selenium/"+result+ "Screenshots.png"));
	}

}
