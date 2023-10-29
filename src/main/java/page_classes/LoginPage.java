package page_classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
	 WebDriver driver;
 	
	 By uName = By.xpath("//*[@name='username']");
	 By pswd = By.xpath("//*[@name='password']");
	 By loginBtn = By.xpath("//*[@type='submit']");
	
	
	 public void Dashboard(WebDriver driver) {
			this.driver=driver;
		}
	 public void enterUsername(String user) {
			driver.findElement(uName).sendKeys(user);
		}
	 public void enterPassword(String pass) {
			driver.findElement(pswd).sendKeys(pass);
		}
	 public void clickLogin() {
			driver.findElement(loginBtn).click();
		}
}
	
