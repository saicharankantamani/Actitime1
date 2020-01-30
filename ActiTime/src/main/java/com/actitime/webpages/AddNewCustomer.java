package com.actitime.webpages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.testbase.BaseClass;



public class AddNewCustomer extends BaseClass{
	public Logger log;
	@FindBy(name = "name")
private WebElement cntextfield;
	@FindBy(name = "createCustomerSubmit")
	private WebElement SubmitButton;
	public AddNewCustomer()
	{
		PageFactory.initElements(BaseClass.driver, this);
		log=Logger.getLogger(AddNewCustomer.class);
		PropertyConfigurator.configure("log4j.Properties");
		
	}
	public void entercnname()
	{
		log.info("Enter customer name");
		cntextfield.sendKeys("sfdf 1531hh0gj0bfd");
	}
	public void cliconsubmmit()
	{
		log.info("click on Submit Button");
		SubmitButton.click();
	}
}