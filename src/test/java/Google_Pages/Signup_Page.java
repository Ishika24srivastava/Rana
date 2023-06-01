package Google_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Google_TestBase.Test_Base1;

public class Signup_Page extends Test_Base1{
	
	@FindBy(xpath = "//div[@id='logo']")
	WebElement Logo;
	@FindBy(xpath = "//span[text()='Create account']")
	WebElement C_acc;
	@FindBy(xpath = "//span[text()='For my personal use']")
	WebElement User;
	@FindBy(xpath = "//input[@name='firstName']")
	WebElement F_name;
	@FindBy(xpath = "//input[@id='lastName']")
	WebElement L_name;
	@FindBy(xpath = "//input[@type='email']")
	WebElement U_name;
	@FindBy(xpath = "//input[@name='Passwd']")
	WebElement Pass;
	@FindBy(xpath = "//input[@name='ConfirmPasswd']")
	WebElement C_pass;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement Show_pass;
	@FindBy(xpath = "//div[@id='accountDetailsNext']")
	WebElement Next;
	
	@FindBy(xpath = "//input[@id='phoneNumberId']")
	WebElement Ph_no;
	@FindBy(xpath = "//span[text()='Next']")
	WebElement Next2;
	
	//@FindBy(xpath = "//select[@id='month']/option[@value=2]")
	//WebElement Birth_month;
	//@FindBy(xpath = "//input[@id='day']")
	//WebElement Birth_date;
	//@FindBy(xpath = "//input[@id='year']")
	//WebElement Birth_year;
	//@FindBy(xpath = "//select[@id='gender']/option[@value=1]")
	//WebElement Gender;
	//@FindBy(xpath = "//span[text()='Next']")
	//WebElement Next3;
	
	public Signup_Page() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logo()
	{
		return Logo;
	}
	public void Create_acc()
	{
		C_acc.click();
	}
	public void Personal_use()
	{
		User.click();
	}
	public WebElement First_name()
	{
		return F_name;
	}
	public WebElement Last_name()
	{
		return L_name;
	}
	public WebElement Email()
	{
		return U_name;
	}
	public WebElement Password()
	{
		return Pass;
	}
	public WebElement Confirm_pass()
	{
		return C_pass;
	}
	public void Show_pass()
	{
		Show_pass.click();
	}
	public void Next()
	{
		Next.click();
	}
	
	public WebElement Phone_no()
	{
		return Ph_no;
	}
	public void Next2()
	{
		Next2.click();
	}
	
	//public void DOB_m()
	//{
		//Birth_month.click();
	//}
	//public void DOB_d()
	//{
		//Birth_date.click();
	//}
	//public void DOB_y()
	//{
		//Birth_year.click();
	//}
	//public void Gender()
	//{
		//Gender.click();
	//}
	//public void Next4()
	//{
		//Next3.click();
	//}

}
