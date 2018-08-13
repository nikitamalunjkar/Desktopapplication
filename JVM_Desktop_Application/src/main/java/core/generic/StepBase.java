package core.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import cucumber.api.Scenario;

public class StepBase {

	public static WiniumDriver driver = null;
	protected static Scenario crScenario;
	//private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	
	By firstNumber1 = By.id("137");
    By secondNumber2 = By.id("93");
    By addButton = By.id("135");
    By equalButton = By.id("121");
    By result = By.id("150");
    
	public void setUp(Scenario cScenario) throws FileNotFoundException, IOException 
	{
		crScenario = cScenario;
		
		Properties objConfig = new Properties();
		objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/main/java/core/config.properties"));
		
		 
	    DesktopOptions option = new DesktopOptions();
	   // option.setApplicationPath(objConfig.getProperty("test.application.path"));
	      option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
	    driver = new WiniumDriver(new URL("http://localhost:9999"), option);      
	}
	

	
	public void tearDown(Scenario scenario) 
	{
		try 
		{
			if (scenario.isFailed()) 
			{
				embedScreenshot();
			}
			driver.manage().deleteAllCookies();
			driver.quit();
			
		}
		catch(Exception exception)
		{
			exception.printStackTrace();
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	
	public static void embedScreenshot()
	{
		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		crScenario.embed(screenshot, "image/png"); //stick it in the report
	}

}
