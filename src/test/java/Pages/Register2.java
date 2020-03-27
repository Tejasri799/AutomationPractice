package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.Utilities;

public class Register2 {
	WebDriver dr;
	Utilities ut;
	public Register2(WebDriver dr)
	{
		this.dr = dr;
		ut = new Utilities(dr);
	}
	By Email = By.xpath("//input[@id='email_create']");
	By Create = By.xpath("//button[@id='SubmitCreate']");
		
	public void Mail(String r)
	{
		WebElement w = ut.Explicit_wait(Email,100);
		w.sendKeys(r);
		
	}
	public void Enter()
	{
		WebElement w = ut.Explicit_wait(Create,20);
		w.click();
	}
	public String ToRegister(String e)
	{
		this.Mail(e);
		this.Enter();
		return null;
	}
}