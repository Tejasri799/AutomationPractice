package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseClass.Utilities;
import Excel.ExcelData;
import Pages.Register1;
import Pages.Register2;
import Pages.Register3;
import Pages.Register4;

public class test_firefox extends ExcelData{
	public static WebDriver dr;
	Utilities ut;
	Register1 reg1;
	Register2 reg2;
	Register3 reg3;
	Register4 reg4;
	String act_result;
	int c1=5;
  @Test(dataProvider = "dp")
  public void f(String email,String fname, String lname, String pwd, String ph, String a1, String ci, String zip, String a2,String exp_result) {
	  reg1=new Register1(dr);
	  reg1.Enter();//click on sing up
	  reg2=new Register2(dr);
	  reg2.ToRegister(email);//click on new registration
	  reg3=new Register3(dr);
	    reg3.Registration(fname,lname,pwd,ph,a1,ci,zip,a2);//enter detail of registration
	   try {
	   reg4=new Register4(dr);
	   act_result = reg4.Profile();//get profile name
	 	 
	   }
	   catch(NullPointerException e)
	   {
		   act_result= reg3.error_mes();//get error message
		
	   }
	   ut.ScreenShot(c1);
	   System.out.println(act_result);
	   Assert.assertTrue(exp_result.contains(act_result));//compare result

  }
  @BeforeMethod
  public void beforeMethod() {
	  ut = new Utilities(dr);
	  dr = ut.bb("firefox");//launch browser

  }

  @AfterMethod
  public void afterMethod() {
	  dr.close();//close browser
	  c1++;
  }


  @DataProvider
  public String[][] dp() {
	  getExcel("Sheet2");//get data from excel
	  return data;
	  
    
  }
}
