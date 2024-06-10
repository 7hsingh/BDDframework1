package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
  WebDriver driver;
  
public void openBrowser() {
	
	 driver = new FirefoxDriver();
	
}
public void openLoginPage() {
	
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();

}
public String Verifytitle() {
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	
	return actualTitle;
	
}
public void enterUserNamePassword(String a, String b) {
	driver.findElement(By.id("user-name")).sendKeys(a);
	driver.findElement(By.id("password")).sendKeys(b);
	
	
}
public void ClickOnLoginbutton() throws InterruptedException {
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(3000);
	
}
public String readErr() {
	
	String actualErr = driver.findElement(By.xpath("//h3[@data-test='error']")).getText();
	System.out.println(actualErr);
	return actualErr;
}
public void closeBrowser() {
	
	driver.quit();
}

	

}
