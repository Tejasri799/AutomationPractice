package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.Utilities;

public class Login {
	WebDriver dr; 
	Utilities ut;
	public Login(WebDriver dr)
	{
		this.dr=dr;
		ut = new Utilities(dr);
	}
	
	By mail_id = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By login = By.xpath("//button[@name='SubmitLogin']");
	
	public void Email(String r)
	{
		WebElement d = ut.Explicit_wait(mail_id, 20);
		d.sendKeys(r);
	}
	public void Password(String r)
	{
		WebElement d = ut.Explicit_wait(password, 20);
		d.sendKeys(r);
	}
	public void SignIn()
	{
		WebElement d = ut.Explicit_wait(login, 20);
		d.click();
	}
	public String Loginfunction(String e,String p)
	{
		this.Email(e);
		this.Password(p);
		this.SignIn();
		String s = dr.findElement(By.xpath("//a[@class='account']")).getText();
		return s;
	}
}


