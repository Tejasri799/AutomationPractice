package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseClass.Utilities;

public class Register1 {
	WebDriver dr;
	Utilities ut;
	public Register1(WebDriver dr)
	{
		this.dr = dr;
		ut = new Utilities(dr);
	}
	By Click = By.xpath("//a[@class='login']");
		
	public void Enter()
	{
		WebElement w = ut.Explicit_wait(Click,20);
		w.click();
	}
}
		

