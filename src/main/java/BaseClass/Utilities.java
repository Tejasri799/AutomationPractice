package BaseClass;

	import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


	public class Utilities
	{
		static WebDriver dr;
		static int counter =1;

		
		public Utilities(WebDriver dr)
		{
			this.dr = dr;
			
		}
			
		public WebElement Explicit_wait(By locator,int timeout)
		{
			WebElement u = null;
			try {
				WebDriverWait wait = new WebDriverWait(dr, timeout);
				u = wait.until(
						ExpectedConditions.visibilityOfElementLocated(locator)
						);
				System.out.println("Element Located");
				
			} catch(Exception u1)
			{
				System.out.println("Element not located"+u1);
			}
		
			return u;
		}
		public WebElement ElementToBeCickable(By locator, int timeout)
		{
			try {
				WebDriverWait wait = new WebDriverWait(dr, timeout);
				WebElement element = wait.until(
						ExpectedConditions.elementToBeClickable(locator)
						);
				System.out.println("Element Located");
				return element;
			} catch (Exception e)
			{
				
				System.out.println("Element not located" + e);
			}
			
			return null;
		}
		
		

		public void ScreenShot(int c1)
		{
			
			File f1=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		    File f2=new File("src\\test\\resources\\SCREENSHOT\\"+c1+".png");
		try {
			FileUtils.copyFile(f1, f2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public WebDriver bb(String b)
	{
		switch(b)
		{
		
		case "Chrome" :
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\DRIVER\\chromedriver_v79.exe");
		dr = new ChromeDriver();
		break; 
		case "firefox" :
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\DRIVER\\geckodriver.exe");
		 dr = new FirefoxDriver();
		  break;
		
	}
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		return dr;
	}
	}
	