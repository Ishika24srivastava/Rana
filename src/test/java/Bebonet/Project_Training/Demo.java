package Bebonet.Project_Training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
  }
}
