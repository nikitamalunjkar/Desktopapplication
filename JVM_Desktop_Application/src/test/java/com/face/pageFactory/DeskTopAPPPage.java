package com.face.pageFactory;

import java.awt.AWTException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.generic.StepBase;
import core.generic.Utilities;
import core.generic.WrapperFunctions;




public class DeskTopAPPPage {
	// Local variables
	public WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	

//	By firstNumber1 = By.id("137");
//	By addButton = By.id("93");
//	By secondNumber2 = By.id("135");
//	By equalButton = By.id("121");
//	By result = By.id("150");
	
	public String firstNumber1 = "137";
	public String addButton = "93";
	public String secondNumber2 = "135";
	public String equalButton = "121";
	public String result = "150";
  
    public boolean enterFirstNumber() throws InterruptedException 
    {
      	Thread.sleep(5000);
        //objWrapperFunctions.click(firstNumber1);
    	StepBase.driver.findElement(By.id(firstNumber1)).click();
    	return true;   	
    }
    
    public boolean clickplusbutton() 
    {
    	//objWrapperFunctions.click(addButton);
    	StepBase.driver.findElement(By.id(addButton)).click();
    	return true;   	
    }
    
    public boolean enterSecondNumber() 
    {
    	//objWrapperFunctions.click(secondNumber2);
    	StepBase.driver.findElement(By.id(secondNumber2)).click();
    	return true;   	
    }
    
    public boolean clickequalbutton() 
    {
    	//objWrapperFunctions.click(equalButton);
    	StepBase.driver.findElement(By.id(equalButton)).click();
    	return true;   	
    }
    
    public boolean observeResult()
    {
	    WebElement output = StepBase.driver.findElement(By.id("150"));
	    output.getAttribute("Name");
	    System.out.println("Result is " + output);
		return true;
    }
	

}
