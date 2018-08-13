package com.face.stepDefinitions;

import java.awt.AWTException;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.face.pageFactory.DeskTopAPPPage;

import core.generic.Utilities;
import core.generic.WrapperFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
/**
 * @ScriptName    : SuiteSteps
 * @Description   : This class contains   
 * @Author: Digvijay Dusane(Aress) @Creation Date : 08 Jan 2018   @Modified Date:                    
 */
public class Desktop_App 
{
	// Local variables
	private WrapperFunctions objWrapperFunctions = new WrapperFunctions();
	private Utilities objUtilities = new Utilities();
	private DeskTopAPPPage objDesktopAppPage = new DeskTopAPPPage();
	
	
	@Given("^Click on First Number$")
	public void clickFirstNumber() throws InterruptedException
	{
		Assert.assertTrue(objDesktopAppPage.enterFirstNumber());
	}
	
	@Then("^Click on Add Button")
	public void clickPlusbutton()
	{
		Assert.assertTrue(objDesktopAppPage.clickplusbutton());
	}
	
	@Then("^Click on Second Number$")
	public void clickSecondNumber()
	{
		Assert.assertTrue(objDesktopAppPage.enterSecondNumber());
	}
	
	@Then("^Click on Equal Button")
	public void clickEqualbutton()
	{
		Assert.assertTrue(objDesktopAppPage.clickequalbutton());	
	}
	
	@Then("^Observe Result")
	public void observeresult()
	{
		Assert.assertTrue(objDesktopAppPage.observeResult());	
	}
}
