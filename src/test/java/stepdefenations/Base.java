package stepdefenations;

import org.openqa.selenium.WebDriver;

import pageObjects.Vendor;
import pageObjects.AddNewCustomerPage;
import pageObjects.AdminPage;
import utilities.ReadConfig;

public class Base {

	WebDriver driver;
	
	AdminPage admin;
	
	public ReadConfig readconfig;
	
	public AddNewCustomerPage addCust;
	
	 public Vendor vendor;
}
