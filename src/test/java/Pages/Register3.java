package Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Utilities;

public class Register3 {
	WebDriver dr;
	Utilities ut;
	public Register3(WebDriver dr)
	{
		this.dr = dr;
		ut = new Utilities(dr);
	}
	By gender = By.xpath("//input[@id='id_gender1']");
	By firstname = By.xpath("//input[@id='customer_firstname']");
	By lastname = By.xpath("//input[@id='customer_lastname']");
	//By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	//By first_name = By.xpath("//input[@id='firstname']");
	//By last_name = By.xpath("//input[@id='lastname']");
	By address = By.xpath("//input[@id='address1']");
	By city = By.xpath("//input[@id='city']");
	By state = By.xpath("//select[@id='id_state']");
	By state1 = By.xpath("//select[@id='id_state']/option[5]");
	By zip_code = By.xpath("//input[@id='postcode']");
	By country = By.xpath("//select[@id='id_country']/option[2]");
	By phone = By.xpath("//input[@id='phone_mobile']");
	By alias_Address = By.xpath("//input[@value='My address']");
	By submit = By.xpath("//button[@id='submitAccount']");
	By error=By.xpath("//div[@class='alert alert-danger']/ol");
	public String error_mes()
	{
	WebElement data = ut.Explicit_wait(error, 20);
	    return data.getText();
	}
	
	
	public void Gender()
		{
		WebElement data = ut.Explicit_wait(gender, 100);
		data.click();
		}
		
	public void Firstname(String r)
		{
		WebElement data = ut.Explicit_wait(firstname, 20);
		if(r.contains("blank"))
		{
			r="";
			data.sendKeys(r);
			
		}
		else
		data.sendKeys(r);
		}
	
	public void Lastname(String r)
		{
		WebElement data = ut.Explicit_wait(lastname, 20);
		if(r.contains("blank"))
		{
			r="";
			data.sendKeys(r);
			
		}
		else
		data.sendKeys(r);
		}
	
	/*
	 * public void Email(String r) { WebElement data = ut.Explicit_wait(email, 20);
	 * data.sendKeys(r); }
	 */
	
	public void Password (String r)
	{
		WebElement data = ut.Explicit_wait(password, 20);
		if(r.contains("blank"))
		{
			r="";
			data.sendKeys(r);
			
		}
		else
		data.sendKeys(r);
	}
	
	/*
	 * public void First_Name(String r) { WebElement data =
	 * ut.Explicit_wait(first_name, 20); data.sendKeys(r); }
	 * 
	 * public void Last_Name(String r) { WebElement data =
	 * ut.Explicit_wait(last_name, 20); data.sendKeys(r); }
	 */
	
	public void Address(String r)
	{
		WebElement data = ut.Explicit_wait(address, 20);
		if(r.contains("blank"))
		{
			r="";
			data.sendKeys(r);
			
		}
		else
		data.sendKeys(r);
	}
	
	public void City(String r)
	{
		WebElement data = ut.Explicit_wait(city, 20);
		if(r.contains("blank"))
		{
			r="";
			data.sendKeys(r);
			
		}
		else
		data.sendKeys(r);
	}
	
	
	public void State()
	{
		
          WebElement data1 = ut.Explicit_wait(state1, 20);
		data1.click();
//		
//		
		

		
		
		

	}
	
	public void zip(String r)
	{
		WebElement data = ut.Explicit_wait(zip_code, 20);
		String s=r.substring(1, (r.length()-1));
		data.sendKeys(s);
	}
	
	public void country()
	{
		WebElement data = ut.Explicit_wait(country,20);
	data.click();
	}
	
	public void Phone(String r)
	{
		WebElement data = ut.Explicit_wait(phone,20);
		String s=r.substring(1, (r.length()-1));
		data.sendKeys(s);
	}
	
	public void AddressPrime(String r)
	{
		WebElement data = ut.Explicit_wait(alias_Address, 20);
		data.sendKeys(r);
	}
	
	public void Submit()
	{
		WebElement data = ut.Explicit_wait(submit, 20);
		data.click();
	}
	
	public void Registration(String fname, String lname, String pwd, String ph, String a1, String ci, String zip, String a2)
	{
		this.Gender();
		this.Firstname(fname);
		this.Lastname(lname);
		//this.Email(em);
		this.Password(pwd);
		//this.First_Name(fname);
	//	this.Last_Name(lname);
		this.Address(a1);
		this.City(ci);
		this.State();
		this.zip(zip);
		this.country();
		this.Phone(ph);
		this.AddressPrime(a2);
		this.Submit();
		
	}
}
	



