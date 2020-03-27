package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.Utilities;

public class Register4 {
	WebDriver dr;
	Utilities ut;
	public Register4(WebDriver dr)
	{
		this.dr = dr;
		ut = new Utilities(dr);
	}
	By profile = By.xpath("//a[@title='View my customer account']");
	By Logout = By.xpath("//a[@title='Log me out']");
		
	public String Profile()
	{
		WebElement w = ut.Explicit_wait(profile,20);
		String verify = w.getText();
		dr.findElement(Logout).click();
		return verify;
		           
	}
	
}


