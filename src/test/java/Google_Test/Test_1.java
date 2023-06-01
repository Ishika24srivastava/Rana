package Google_Test;

import org.testng.annotations.Test;

import Google_Pages.Signup_Page;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

public class Test_1 extends Signup_Page {
	Test_1 t1;
  
  @BeforeSuite
  public void launch() throws IOException, InterruptedException {
	  setup();
	  t1 = new Test_1();	  
  }
  
  @Test (priority = 1)
  public void Functionality() throws InterruptedException {
	  String s = t1.logo().getText();
	  System.out.println("Logo: " + s);
	  t1.Create_acc();
	  Thread.sleep(2000);
	  t1.Personal_use();
	  Thread.sleep(2000);
  }
	  
  @Test (priority = 2)
  public void Create_Account() throws InterruptedException {
	  t1.First_name().sendKeys(prop.getProperty("F_name"));
	  t1.Last_name().sendKeys(prop.getProperty("L_name"));
	  Thread.sleep(2000);
	  t1.Email().sendKeys(prop.getProperty("U_name"));
	  t1.Password().sendKeys(prop.getProperty("Pass"));
	  t1.Confirm_pass().sendKeys(prop.getProperty("C_pass"));
	  Thread.sleep(1000);
	  t1.Show_pass();
	  Thread.sleep(1000);  
	  t1.Next();
	  Thread.sleep(2000);
  }
  
  @Test (priority = 3)
  public void verification() throws InterruptedException {
	  t1.Phone_no().sendKeys(prop.getProperty("Ph_no"));
	  t1.Next2();
	  Thread.sleep(2000);
  }  
	  
	  //t1.DOB_m();
	  //Thread.sleep(1000);
	  //t1.DOB_d();
	  //Thread.sleep(1000);
	  //t1.DOB_y();
	  //Thread.sleep(2000);
	  //t1.Gender();
	  //Thread.sleep(1000);
	  //t1.Next4();
  }


